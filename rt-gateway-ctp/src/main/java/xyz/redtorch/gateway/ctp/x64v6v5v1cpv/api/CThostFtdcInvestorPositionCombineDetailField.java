/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v5v1cpv.api;

public class CThostFtdcInvestorPositionCombineDetailField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcInvestorPositionCombineDetailField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInvestorPositionCombineDetailField obj) {
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
        jctpv6v5v1cpx64apiJNI.delete_CThostFtdcInvestorPositionCombineDetailField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_TradingDay_get(swigCPtr, this);
  }

  public void setOpenDate(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_OpenDate_set(swigCPtr, this, value);
  }

  public String getOpenDate() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_OpenDate_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_ExchangeID_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_SettlementID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_InvestorID_get(swigCPtr, this);
  }

  public void setComTradeID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_ComTradeID_set(swigCPtr, this, value);
  }

  public String getComTradeID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_ComTradeID_get(swigCPtr, this);
  }

  public void setTradeID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_TradeID_set(swigCPtr, this, value);
  }

  public String getTradeID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_TradeID_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_reserve1_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_HedgeFlag_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_Direction_get(swigCPtr, this);
  }

  public void setTotalAmt(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_TotalAmt_set(swigCPtr, this, value);
  }

  public int getTotalAmt() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_TotalAmt_get(swigCPtr, this);
  }

  public void setMargin(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_Margin_set(swigCPtr, this, value);
  }

  public double getMargin() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_Margin_get(swigCPtr, this);
  }

  public void setExchMargin(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_ExchMargin_set(swigCPtr, this, value);
  }

  public double getExchMargin() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_ExchMargin_get(swigCPtr, this);
  }

  public void setMarginRateByMoney(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_MarginRateByMoney_set(swigCPtr, this, value);
  }

  public double getMarginRateByMoney() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_MarginRateByMoney_get(swigCPtr, this);
  }

  public void setMarginRateByVolume(double value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_MarginRateByVolume_set(swigCPtr, this, value);
  }

  public double getMarginRateByVolume() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_MarginRateByVolume_get(swigCPtr, this);
  }

  public void setLegID(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_LegID_set(swigCPtr, this, value);
  }

  public int getLegID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_LegID_get(swigCPtr, this);
  }

  public void setLegMultiple(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_LegMultiple_set(swigCPtr, this, value);
  }

  public int getLegMultiple() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_LegMultiple_get(swigCPtr, this);
  }

  public void setReserve2(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_reserve2_set(swigCPtr, this, value);
  }

  public String getReserve2() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_reserve2_get(swigCPtr, this);
  }

  public void setTradeGroupID(int value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_TradeGroupID_set(swigCPtr, this, value);
  }

  public int getTradeGroupID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_TradeGroupID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_InvestUnitID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_InstrumentID_get(swigCPtr, this);
  }

  public void setCombInstrumentID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_CombInstrumentID_set(swigCPtr, this, value);
  }

  public String getCombInstrumentID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcInvestorPositionCombineDetailField_CombInstrumentID_get(swigCPtr, this);
  }

  public CThostFtdcInvestorPositionCombineDetailField() {
    this(jctpv6v5v1cpx64apiJNI.new_CThostFtdcInvestorPositionCombineDetailField(), true);
  }

}
