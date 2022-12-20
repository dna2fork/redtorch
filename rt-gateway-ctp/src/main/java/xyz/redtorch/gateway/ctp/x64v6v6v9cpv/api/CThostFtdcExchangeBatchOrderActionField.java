/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v9cpv.api;

public class CThostFtdcExchangeBatchOrderActionField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcExchangeBatchOrderActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeBatchOrderActionField obj) {
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
        jctpv6v6v9cpx64apiJNI.delete_CThostFtdcExchangeBatchOrderActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcExchangeBatchOrderActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcExchangeBatchOrderActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setActionDate(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcExchangeBatchOrderActionField_ActionDate_set(swigCPtr, this, value);
  }

  public String getActionDate() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcExchangeBatchOrderActionField_ActionDate_get(swigCPtr, this);
  }

  public void setActionTime(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcExchangeBatchOrderActionField_ActionTime_set(swigCPtr, this, value);
  }

  public String getActionTime() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcExchangeBatchOrderActionField_ActionTime_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcExchangeBatchOrderActionField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcExchangeBatchOrderActionField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcExchangeBatchOrderActionField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcExchangeBatchOrderActionField_InstallID_get(swigCPtr, this);
  }

  public void setActionLocalID(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcExchangeBatchOrderActionField_ActionLocalID_set(swigCPtr, this, value);
  }

  public String getActionLocalID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcExchangeBatchOrderActionField_ActionLocalID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcExchangeBatchOrderActionField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcExchangeBatchOrderActionField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcExchangeBatchOrderActionField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcExchangeBatchOrderActionField_ClientID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcExchangeBatchOrderActionField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcExchangeBatchOrderActionField_BusinessUnit_get(swigCPtr, this);
  }

  public void setOrderActionStatus(char value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcExchangeBatchOrderActionField_OrderActionStatus_set(swigCPtr, this, value);
  }

  public char getOrderActionStatus() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcExchangeBatchOrderActionField_OrderActionStatus_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcExchangeBatchOrderActionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcExchangeBatchOrderActionField_UserID_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcExchangeBatchOrderActionField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcExchangeBatchOrderActionField_reserve1_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcExchangeBatchOrderActionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcExchangeBatchOrderActionField_MacAddress_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcExchangeBatchOrderActionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcExchangeBatchOrderActionField_IPAddress_get(swigCPtr, this);
  }

  public CThostFtdcExchangeBatchOrderActionField() {
    this(jctpv6v6v9cpx64apiJNI.new_CThostFtdcExchangeBatchOrderActionField(), true);
  }

}
