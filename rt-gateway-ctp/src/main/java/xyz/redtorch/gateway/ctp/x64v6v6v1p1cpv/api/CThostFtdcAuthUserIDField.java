/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v1p1cpv.api;

public class CThostFtdcAuthUserIDField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcAuthUserIDField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcAuthUserIDField obj) {
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
        jctpv6v6v1p1cpx64apiJNI.delete_CThostFtdcAuthUserIDField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcAuthUserIDField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcAuthUserIDField_BrokerID_get(swigCPtr, this);
  }

  public void setAppID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcAuthUserIDField_AppID_set(swigCPtr, this, value);
  }

  public String getAppID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcAuthUserIDField_AppID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcAuthUserIDField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcAuthUserIDField_UserID_get(swigCPtr, this);
  }

  public void setAuthType(char value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcAuthUserIDField_AuthType_set(swigCPtr, this, value);
  }

  public char getAuthType() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcAuthUserIDField_AuthType_get(swigCPtr, this);
  }

  public CThostFtdcAuthUserIDField() {
    this(jctpv6v6v1p1cpx64apiJNI.new_CThostFtdcAuthUserIDField(), true);
  }

}
