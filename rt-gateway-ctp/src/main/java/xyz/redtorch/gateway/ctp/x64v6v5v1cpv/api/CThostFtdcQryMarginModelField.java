/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v5v1cpv.api;

public class CThostFtdcQryMarginModelField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryMarginModelField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryMarginModelField obj) {
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
        jctpv6v5v1cpx64apiJNI.delete_CThostFtdcQryMarginModelField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcQryMarginModelField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcQryMarginModelField_BrokerID_get(swigCPtr, this);
  }

  public void setMarginModelID(String value) {
    jctpv6v5v1cpx64apiJNI.CThostFtdcQryMarginModelField_MarginModelID_set(swigCPtr, this, value);
  }

  public String getMarginModelID() {
    return jctpv6v5v1cpx64apiJNI.CThostFtdcQryMarginModelField_MarginModelID_get(swigCPtr, this);
  }

  public CThostFtdcQryMarginModelField() {
    this(jctpv6v5v1cpx64apiJNI.new_CThostFtdcQryMarginModelField(), true);
  }

}
