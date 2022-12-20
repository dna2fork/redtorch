/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v9v.api;

public class CThostFtdcTradeField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcTradeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTradeField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpv6v6v9x64apiJNI.delete_CThostFtdcTradeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcTradeField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcTradeField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcTradeField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcTradeField_InvestorID_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcTradeField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return jctpv6v6v9x64apiJNI.CThostFtdcTradeField_reserve1_get(swigCPtr, this);
  }

  public void setOrderRef(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcTradeField_OrderRef_set(swigCPtr, this, value);
  }

  public String getOrderRef() {
    return jctpv6v6v9x64apiJNI.CThostFtdcTradeField_OrderRef_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcTradeField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcTradeField_UserID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcTradeField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcTradeField_ExchangeID_get(swigCPtr, this);
  }

  public void setTradeID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcTradeField_TradeID_set(swigCPtr, this, value);
  }

  public String getTradeID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcTradeField_TradeID_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    jctpv6v6v9x64apiJNI.CThostFtdcTradeField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return jctpv6v6v9x64apiJNI.CThostFtdcTradeField_Direction_get(swigCPtr, this);
  }

  public void setOrderSysID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcTradeField_OrderSysID_set(swigCPtr, this, value);
  }

  public String getOrderSysID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcTradeField_OrderSysID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcTradeField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcTradeField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcTradeField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcTradeField_ClientID_get(swigCPtr, this);
  }

  public void setTradingRole(char value) {
    jctpv6v6v9x64apiJNI.CThostFtdcTradeField_TradingRole_set(swigCPtr, this, value);
  }

  public char getTradingRole() {
    return jctpv6v6v9x64apiJNI.CThostFtdcTradeField_TradingRole_get(swigCPtr, this);
  }

  public void setReserve2(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcTradeField_reserve2_set(swigCPtr, this, value);
  }

  public String getReserve2() {
    return jctpv6v6v9x64apiJNI.CThostFtdcTradeField_reserve2_get(swigCPtr, this);
  }

  public void setOffsetFlag(char value) {
    jctpv6v6v9x64apiJNI.CThostFtdcTradeField_OffsetFlag_set(swigCPtr, this, value);
  }

  public char getOffsetFlag() {
    return jctpv6v6v9x64apiJNI.CThostFtdcTradeField_OffsetFlag_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    jctpv6v6v9x64apiJNI.CThostFtdcTradeField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return jctpv6v6v9x64apiJNI.CThostFtdcTradeField_HedgeFlag_get(swigCPtr, this);
  }

  public void setPrice(double value) {
    jctpv6v6v9x64apiJNI.CThostFtdcTradeField_Price_set(swigCPtr, this, value);
  }

  public double getPrice() {
    return jctpv6v6v9x64apiJNI.CThostFtdcTradeField_Price_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcTradeField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return jctpv6v6v9x64apiJNI.CThostFtdcTradeField_Volume_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcTradeField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return jctpv6v6v9x64apiJNI.CThostFtdcTradeField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcTradeField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return jctpv6v6v9x64apiJNI.CThostFtdcTradeField_TradeTime_get(swigCPtr, this);
  }

  public void setTradeType(char value) {
    jctpv6v6v9x64apiJNI.CThostFtdcTradeField_TradeType_set(swigCPtr, this, value);
  }

  public char getTradeType() {
    return jctpv6v6v9x64apiJNI.CThostFtdcTradeField_TradeType_get(swigCPtr, this);
  }

  public void setPriceSource(char value) {
    jctpv6v6v9x64apiJNI.CThostFtdcTradeField_PriceSource_set(swigCPtr, this, value);
  }

  public char getPriceSource() {
    return jctpv6v6v9x64apiJNI.CThostFtdcTradeField_PriceSource_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcTradeField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcTradeField_TraderID_get(swigCPtr, this);
  }

  public void setOrderLocalID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcTradeField_OrderLocalID_set(swigCPtr, this, value);
  }

  public String getOrderLocalID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcTradeField_OrderLocalID_get(swigCPtr, this);
  }

  public void setClearingPartID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcTradeField_ClearingPartID_set(swigCPtr, this, value);
  }

  public String getClearingPartID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcTradeField_ClearingPartID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcTradeField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return jctpv6v6v9x64apiJNI.CThostFtdcTradeField_BusinessUnit_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcTradeField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return jctpv6v6v9x64apiJNI.CThostFtdcTradeField_SequenceNo_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcTradeField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpv6v6v9x64apiJNI.CThostFtdcTradeField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcTradeField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcTradeField_SettlementID_get(swigCPtr, this);
  }

  public void setBrokerOrderSeq(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcTradeField_BrokerOrderSeq_set(swigCPtr, this, value);
  }

  public int getBrokerOrderSeq() {
    return jctpv6v6v9x64apiJNI.CThostFtdcTradeField_BrokerOrderSeq_get(swigCPtr, this);
  }

  public void setTradeSource(char value) {
    jctpv6v6v9x64apiJNI.CThostFtdcTradeField_TradeSource_set(swigCPtr, this, value);
  }

  public char getTradeSource() {
    return jctpv6v6v9x64apiJNI.CThostFtdcTradeField_TradeSource_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcTradeField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcTradeField_InvestUnitID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcTradeField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcTradeField_InstrumentID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcTradeField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcTradeField_ExchangeInstID_get(swigCPtr, this);
  }

  public CThostFtdcTradeField() {
    this(jctpv6v6v9x64apiJNI.new_CThostFtdcTradeField(), true);
  }

}
