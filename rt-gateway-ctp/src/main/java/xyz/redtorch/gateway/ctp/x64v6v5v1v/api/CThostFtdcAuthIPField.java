/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v5v1v.api;

public class CThostFtdcAuthIPField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcAuthIPField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcAuthIPField obj) {
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
        jctpv6v5v1x64apiJNI.delete_CThostFtdcAuthIPField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcAuthIPField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcAuthIPField_BrokerID_get(swigCPtr, this);
  }

  public void setAppID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcAuthIPField_AppID_set(swigCPtr, this, value);
  }

  public String getAppID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcAuthIPField_AppID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcAuthIPField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return jctpv6v5v1x64apiJNI.CThostFtdcAuthIPField_IPAddress_get(swigCPtr, this);
  }

  public CThostFtdcAuthIPField() {
    this(jctpv6v5v1x64apiJNI.new_CThostFtdcAuthIPField(), true);
  }

}
