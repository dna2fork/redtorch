/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v19p1v.api;

public class CThostFtdcQryProductField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryProductField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryProductField obj) {
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
        jctpv6v3v19p1x64apiJNI.delete_CThostFtdcQryProductField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setProductID(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcQryProductField_ProductID_set(swigCPtr, this, value);
  }

  public String getProductID() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcQryProductField_ProductID_get(swigCPtr, this);
  }

  public void setProductClass(char value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcQryProductField_ProductClass_set(swigCPtr, this, value);
  }

  public char getProductClass() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcQryProductField_ProductClass_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcQryProductField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcQryProductField_ExchangeID_get(swigCPtr, this);
  }

  public CThostFtdcQryProductField() {
    this(jctpv6v3v19p1x64apiJNI.new_CThostFtdcQryProductField(), true);
  }

}
