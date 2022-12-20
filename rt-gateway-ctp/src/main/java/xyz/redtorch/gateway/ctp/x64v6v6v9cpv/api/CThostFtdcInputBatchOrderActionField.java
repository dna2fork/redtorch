/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v9cpv.api;

public class CThostFtdcInputBatchOrderActionField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcInputBatchOrderActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInputBatchOrderActionField obj) {
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
        jctpv6v6v9cpx64apiJNI.delete_CThostFtdcInputBatchOrderActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcInputBatchOrderActionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcInputBatchOrderActionField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcInputBatchOrderActionField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcInputBatchOrderActionField_InvestorID_get(swigCPtr, this);
  }

  public void setOrderActionRef(int value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcInputBatchOrderActionField_OrderActionRef_set(swigCPtr, this, value);
  }

  public int getOrderActionRef() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcInputBatchOrderActionField_OrderActionRef_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcInputBatchOrderActionField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcInputBatchOrderActionField_RequestID_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcInputBatchOrderActionField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcInputBatchOrderActionField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcInputBatchOrderActionField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcInputBatchOrderActionField_SessionID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcInputBatchOrderActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcInputBatchOrderActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcInputBatchOrderActionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcInputBatchOrderActionField_UserID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcInputBatchOrderActionField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcInputBatchOrderActionField_InvestUnitID_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcInputBatchOrderActionField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcInputBatchOrderActionField_reserve1_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcInputBatchOrderActionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcInputBatchOrderActionField_MacAddress_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcInputBatchOrderActionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcInputBatchOrderActionField_IPAddress_get(swigCPtr, this);
  }

  public CThostFtdcInputBatchOrderActionField() {
    this(jctpv6v6v9cpx64apiJNI.new_CThostFtdcInputBatchOrderActionField(), true);
  }

}
