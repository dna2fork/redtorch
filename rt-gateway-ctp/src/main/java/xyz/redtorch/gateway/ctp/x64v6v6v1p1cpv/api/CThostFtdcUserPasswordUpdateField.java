/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v1p1cpv.api;

public class CThostFtdcUserPasswordUpdateField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcUserPasswordUpdateField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcUserPasswordUpdateField obj) {
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
        jctpv6v6v1p1cpx64apiJNI.delete_CThostFtdcUserPasswordUpdateField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcUserPasswordUpdateField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcUserPasswordUpdateField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcUserPasswordUpdateField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcUserPasswordUpdateField_UserID_get(swigCPtr, this);
  }

  public void setOldPassword(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcUserPasswordUpdateField_OldPassword_set(swigCPtr, this, value);
  }

  public String getOldPassword() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcUserPasswordUpdateField_OldPassword_get(swigCPtr, this);
  }

  public void setNewPassword(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcUserPasswordUpdateField_NewPassword_set(swigCPtr, this, value);
  }

  public String getNewPassword() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcUserPasswordUpdateField_NewPassword_get(swigCPtr, this);
  }

  public CThostFtdcUserPasswordUpdateField() {
    this(jctpv6v6v1p1cpx64apiJNI.new_CThostFtdcUserPasswordUpdateField(), true);
  }

}
