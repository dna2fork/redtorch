/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v9cpv.api;

public class CThostFtdcAuthenticationInfoField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcAuthenticationInfoField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcAuthenticationInfoField obj) {
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
        jctpv6v6v9cpx64apiJNI.delete_CThostFtdcAuthenticationInfoField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcAuthenticationInfoField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcAuthenticationInfoField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcAuthenticationInfoField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcAuthenticationInfoField_UserID_get(swigCPtr, this);
  }

  public void setUserProductInfo(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcAuthenticationInfoField_UserProductInfo_set(swigCPtr, this, value);
  }

  public String getUserProductInfo() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcAuthenticationInfoField_UserProductInfo_get(swigCPtr, this);
  }

  public void setAuthInfo(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcAuthenticationInfoField_AuthInfo_set(swigCPtr, this, value);
  }

  public String getAuthInfo() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcAuthenticationInfoField_AuthInfo_get(swigCPtr, this);
  }

  public void setIsResult(int value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcAuthenticationInfoField_IsResult_set(swigCPtr, this, value);
  }

  public int getIsResult() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcAuthenticationInfoField_IsResult_get(swigCPtr, this);
  }

  public void setAppID(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcAuthenticationInfoField_AppID_set(swigCPtr, this, value);
  }

  public String getAppID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcAuthenticationInfoField_AppID_get(swigCPtr, this);
  }

  public void setAppType(char value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcAuthenticationInfoField_AppType_set(swigCPtr, this, value);
  }

  public char getAppType() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcAuthenticationInfoField_AppType_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcAuthenticationInfoField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcAuthenticationInfoField_reserve1_get(swigCPtr, this);
  }

  public void setClientIPAddress(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcAuthenticationInfoField_ClientIPAddress_set(swigCPtr, this, value);
  }

  public String getClientIPAddress() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcAuthenticationInfoField_ClientIPAddress_get(swigCPtr, this);
  }

  public CThostFtdcAuthenticationInfoField() {
    this(jctpv6v6v9cpx64apiJNI.new_CThostFtdcAuthenticationInfoField(), true);
  }

}
