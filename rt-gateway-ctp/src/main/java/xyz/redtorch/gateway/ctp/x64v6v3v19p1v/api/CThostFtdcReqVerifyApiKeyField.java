/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v19p1v.api;

public class CThostFtdcReqVerifyApiKeyField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcReqVerifyApiKeyField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcReqVerifyApiKeyField obj) {
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
        jctpv6v3v19p1x64apiJNI.delete_CThostFtdcReqVerifyApiKeyField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setApiHandshakeDataLen(int value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcReqVerifyApiKeyField_ApiHandshakeDataLen_set(swigCPtr, this, value);
  }

  public int getApiHandshakeDataLen() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcReqVerifyApiKeyField_ApiHandshakeDataLen_get(swigCPtr, this);
  }

  public void setApiHandshakeData(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcReqVerifyApiKeyField_ApiHandshakeData_set(swigCPtr, this, value);
  }

  public String getApiHandshakeData() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcReqVerifyApiKeyField_ApiHandshakeData_get(swigCPtr, this);
  }

  public CThostFtdcReqVerifyApiKeyField() {
    this(jctpv6v3v19p1x64apiJNI.new_CThostFtdcReqVerifyApiKeyField(), true);
  }

}
