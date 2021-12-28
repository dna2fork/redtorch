/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v1p1v.api;

public class CThostFtdcQryOptionInstrTradeCostField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryOptionInstrTradeCostField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryOptionInstrTradeCostField obj) {
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
        jctpv6v6v1p1x64apiJNI.delete_CThostFtdcQryOptionInstrTradeCostField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcQryOptionInstrTradeCostField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcQryOptionInstrTradeCostField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcQryOptionInstrTradeCostField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcQryOptionInstrTradeCostField_InvestorID_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcQryOptionInstrTradeCostField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcQryOptionInstrTradeCostField_reserve1_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcQryOptionInstrTradeCostField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcQryOptionInstrTradeCostField_HedgeFlag_get(swigCPtr, this);
  }

  public void setInputPrice(double value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcQryOptionInstrTradeCostField_InputPrice_set(swigCPtr, this, value);
  }

  public double getInputPrice() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcQryOptionInstrTradeCostField_InputPrice_get(swigCPtr, this);
  }

  public void setUnderlyingPrice(double value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcQryOptionInstrTradeCostField_UnderlyingPrice_set(swigCPtr, this, value);
  }

  public double getUnderlyingPrice() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcQryOptionInstrTradeCostField_UnderlyingPrice_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcQryOptionInstrTradeCostField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcQryOptionInstrTradeCostField_ExchangeID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcQryOptionInstrTradeCostField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcQryOptionInstrTradeCostField_InvestUnitID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcQryOptionInstrTradeCostField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcQryOptionInstrTradeCostField_InstrumentID_get(swigCPtr, this);
  }

  public CThostFtdcQryOptionInstrTradeCostField() {
    this(jctpv6v6v1p1x64apiJNI.new_CThostFtdcQryOptionInstrTradeCostField(), true);
  }

}
