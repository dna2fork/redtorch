/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v9cpv.api;

public class CThostFtdcQryEWarrantOffsetField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryEWarrantOffsetField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryEWarrantOffsetField obj) {
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
        jctpv6v6v9cpx64apiJNI.delete_CThostFtdcQryEWarrantOffsetField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcQryEWarrantOffsetField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcQryEWarrantOffsetField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcQryEWarrantOffsetField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcQryEWarrantOffsetField_InvestorID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcQryEWarrantOffsetField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcQryEWarrantOffsetField_ExchangeID_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcQryEWarrantOffsetField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcQryEWarrantOffsetField_reserve1_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcQryEWarrantOffsetField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcQryEWarrantOffsetField_InvestUnitID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcQryEWarrantOffsetField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcQryEWarrantOffsetField_InstrumentID_get(swigCPtr, this);
  }

  public CThostFtdcQryEWarrantOffsetField() {
    this(jctpv6v6v9cpx64apiJNI.new_CThostFtdcQryEWarrantOffsetField(), true);
  }

}
