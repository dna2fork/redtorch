/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v9cpv.api;

public class CThostFtdcQryMaxOrderVolumeField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryMaxOrderVolumeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryMaxOrderVolumeField obj) {
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
        jctpv6v6v9cpx64apiJNI.delete_CThostFtdcQryMaxOrderVolumeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcQryMaxOrderVolumeField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcQryMaxOrderVolumeField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcQryMaxOrderVolumeField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcQryMaxOrderVolumeField_InvestorID_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcQryMaxOrderVolumeField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcQryMaxOrderVolumeField_reserve1_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcQryMaxOrderVolumeField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcQryMaxOrderVolumeField_Direction_get(swigCPtr, this);
  }

  public void setOffsetFlag(char value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcQryMaxOrderVolumeField_OffsetFlag_set(swigCPtr, this, value);
  }

  public char getOffsetFlag() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcQryMaxOrderVolumeField_OffsetFlag_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcQryMaxOrderVolumeField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcQryMaxOrderVolumeField_HedgeFlag_get(swigCPtr, this);
  }

  public void setMaxVolume(int value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcQryMaxOrderVolumeField_MaxVolume_set(swigCPtr, this, value);
  }

  public int getMaxVolume() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcQryMaxOrderVolumeField_MaxVolume_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcQryMaxOrderVolumeField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcQryMaxOrderVolumeField_ExchangeID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcQryMaxOrderVolumeField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcQryMaxOrderVolumeField_InvestUnitID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcQryMaxOrderVolumeField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcQryMaxOrderVolumeField_InstrumentID_get(swigCPtr, this);
  }

  public CThostFtdcQryMaxOrderVolumeField() {
    this(jctpv6v6v9cpx64apiJNI.new_CThostFtdcQryMaxOrderVolumeField(), true);
  }

}
