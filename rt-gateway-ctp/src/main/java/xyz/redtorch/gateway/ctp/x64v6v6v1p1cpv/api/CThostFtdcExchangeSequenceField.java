/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v1p1cpv.api;

public class CThostFtdcExchangeSequenceField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcExchangeSequenceField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeSequenceField obj) {
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
        jctpv6v6v1p1cpx64apiJNI.delete_CThostFtdcExchangeSequenceField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeSequenceField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeSequenceField_ExchangeID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeSequenceField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeSequenceField_SequenceNo_get(swigCPtr, this);
  }

  public void setMarketStatus(char value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeSequenceField_MarketStatus_set(swigCPtr, this, value);
  }

  public char getMarketStatus() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcExchangeSequenceField_MarketStatus_get(swigCPtr, this);
  }

  public CThostFtdcExchangeSequenceField() {
    this(jctpv6v6v1p1cpx64apiJNI.new_CThostFtdcExchangeSequenceField(), true);
  }

}
