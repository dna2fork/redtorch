package xyz.redtorch.common.service.impl;

import com.lmax.disruptor.*;
import com.lmax.disruptor.dsl.Disruptor;
import com.lmax.disruptor.dsl.ProducerType;
import com.lmax.disruptor.util.DaemonThreadFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import xyz.redtorch.common.service.FastEventService;
import xyz.redtorch.pb.CoreField.*;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//@Service
public class FastEventServiceImpl implements FastEventService, InitializingBean {

    private static final Logger logger = LoggerFactory.getLogger(FastEventServiceImpl.class);

    private static final ExecutorService executor = Executors.newCachedThreadPool(DaemonThreadFactory.INSTANCE);

    private final Map<EventHandler<FastEvent>, BatchEventProcessor<FastEvent>> handlerProcessorMap = new ConcurrentHashMap<>();

    private RingBuffer<FastEvent> ringBuffer;

    @Value("${xyz.redtorch.common.service.impl.FastEventServiceImpl.waitStrategy}")
    private String waitStrategy;

    @Override
    public void afterPropertiesSet() throws Exception {
        Disruptor<FastEvent> disruptor;
        if ("BusySpinWaitStrategy".equals(waitStrategy)) {
            disruptor = new Disruptor<>(new FastEventFactory(), 65536, DaemonThreadFactory.INSTANCE,
                    ProducerType.MULTI, new BusySpinWaitStrategy());
        } else if ("SleepingWaitStrategy".equals(waitStrategy)) {
            disruptor = new Disruptor<>(new FastEventFactory(), 65536, DaemonThreadFactory.INSTANCE,
                    ProducerType.MULTI, new SleepingWaitStrategy());
        } else if ("BlockingWaitStrategy".equals(waitStrategy)) {
            disruptor = new Disruptor<>(new FastEventFactory(), 65536, DaemonThreadFactory.INSTANCE,
                    ProducerType.MULTI, new BlockingWaitStrategy());
        } else {
            disruptor = new Disruptor<>(new FastEventFactory(), 65536, DaemonThreadFactory.INSTANCE,
                    ProducerType.MULTI, new YieldingWaitStrategy());
        }
        ringBuffer = disruptor.start();
    }

    @Override
    public synchronized BatchEventProcessor<FastEvent> addHandler(FastEventDynamicHandler handler) {
        BatchEventProcessor<FastEvent> processor;
        processor = new BatchEventProcessor<>(ringBuffer, ringBuffer.newBarrier(), handler);
        ringBuffer.addGatingSequences(processor.getSequence());
        executor.execute(processor);
        handlerProcessorMap.put(handler, processor);
        return processor;
    }

    @Override
    public void removeHandler(FastEventDynamicHandler handler) {
        if (handlerProcessorMap.containsKey(handler)) {
            BatchEventProcessor<FastEvent> processor = handlerProcessorMap.get(handler);
            // Remove a processor.
            // Stop the processor
            processor.halt();
            // Wait for shutdown the complete
            try {
                handler.awaitShutdown();
            } catch (InterruptedException e) {
                logger.error("捕获到中断", e);
            }
            // Remove the gating sequence from the ring buffer
            ringBuffer.removeGatingSequence(processor.getSequence());
            handlerProcessorMap.remove(handler);
        } else {
            logger.warn("未找到Processor,无法移除");
        }

    }

    @Override
    public RingBuffer<FastEvent> getRingBuffer() {
        return ringBuffer;
    }

    @Override
    public void emitEvent(FastEventType fastEventType, String event, Object obj) {
        RingBuffer<FastEvent> ringBuffer = getRingBuffer();
        long sequence = ringBuffer.next(); // Grab the next sequence
        try {
            FastEvent fastEvent = ringBuffer.get(sequence); // Get the entry in the Disruptor for the sequence
            fastEvent.setFastEventType(fastEventType);
            fastEvent.setEvent(event);
            fastEvent.setObj(obj);
        } finally {
            ringBuffer.publish(sequence);
        }
    }

    @Override
    public void emitPosition(PositionField position) {

        RingBuffer<FastEvent> ringBuffer = getRingBuffer();
        long sequence = ringBuffer.next(); // Grab the next sequence
        try {
            FastEvent fastEvent = ringBuffer.get(sequence); // Get the entry in the Disruptor for the sequence
            fastEvent.setObj(position);
            fastEvent.setEvent(position.getPositionId());
            fastEvent.setFastEventType(FastEventType.POSITION);
        } finally {
            ringBuffer.publish(sequence);
        }
    }

    @Override
    public void emitAccount(AccountField account) {
        // 发送事件

        RingBuffer<FastEvent> ringBuffer = getRingBuffer();
        long sequence = ringBuffer.next(); // Grab the next sequence
        try {
            FastEvent fastEvent = ringBuffer.get(sequence); // Get the entry in the Disruptor for the sequence
            fastEvent.setObj(account);
            fastEvent.setEvent(account.getAccountId());
            fastEvent.setFastEventType(FastEventType.ACCOUNT);
        } finally {
            ringBuffer.publish(sequence);
        }

    }

    @Override
    public void emitContract(ContractField contract) {
        // 发送事件

        RingBuffer<FastEvent> ringBuffer = getRingBuffer();
        long sequence = ringBuffer.next(); // Grab the next sequence
        try {
            FastEvent fastEvent = ringBuffer.get(sequence); // Get the entry in the Disruptor for the sequence
            fastEvent.setObj(contract);
            fastEvent.setEvent(contract.getContractId());
            fastEvent.setFastEventType(FastEventType.CONTRACT);
        } finally {
            ringBuffer.publish(sequence);
        }

    }

    @Override
    public void emitTick(TickField tick) {

        RingBuffer<FastEvent> ringBuffer = getRingBuffer();
        long sequence = ringBuffer.next(); // Grab the next sequence
        try {
            FastEvent fastEvent = ringBuffer.get(sequence); // Get the entry in the Disruptor for the sequence
            fastEvent.setObj(tick);
            fastEvent.setEvent(tick.getUniformSymbol() + "@" + tick.getGatewayId());
            fastEvent.setFastEventType(FastEventType.TICK);
        } finally {
            ringBuffer.publish(sequence);
        }

    }

    @Override
    public void emitTrade(TradeField trade) {
        // 发送特定合约成交事件
        RingBuffer<FastEvent> ringBuffer = getRingBuffer();
        long sequence = ringBuffer.next(); // Grab the next sequence
        try {
            FastEvent fastEvent = ringBuffer.get(sequence); // Get the entry in the Disruptor for the sequence
            fastEvent.setObj(trade);
            fastEvent.setEvent(trade.getOriginOrderId());
            fastEvent.setFastEventType(FastEventType.TRADE);
        } finally {
            ringBuffer.publish(sequence);
        }

    }

    @Override
    public void emitOrder(OrderField order) {
        // 发送带定单ID的事件
        RingBuffer<FastEvent> ringBuffer = getRingBuffer();
        long sequence = ringBuffer.next(); // Grab the next sequence

        try {
            FastEvent fastEvent = ringBuffer.get(sequence); // Get the entry in the Disruptor for the sequence
            fastEvent.setObj(order);
            fastEvent.setEvent(order.getOriginOrderId());
            fastEvent.setFastEventType(FastEventType.ORDER);
        } finally {
            ringBuffer.publish(sequence);
        }

    }

    @Override
    public void emitNotice(NoticeField notice) {
        RingBuffer<FastEvent> ringBuffer = getRingBuffer();
        long sequence = ringBuffer.next(); // Grab the next sequence
        try {
            FastEvent fastEvent = ringBuffer.get(sequence); // Get the entry in the Disruptor for the sequence
            fastEvent.setObj(notice);
            fastEvent.setEvent(FastEventType.NOTICE.getDeclaringClass().getName());
            fastEvent.setFastEventType(FastEventType.NOTICE);
        } finally {
            ringBuffer.publish(sequence);
        }
    }

}
