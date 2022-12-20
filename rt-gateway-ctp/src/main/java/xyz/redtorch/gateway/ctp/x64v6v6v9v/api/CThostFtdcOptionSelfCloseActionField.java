/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v9v.api;

public class CThostFtdcOptionSelfCloseActionField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcOptionSelfCloseActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcOptionSelfCloseActionField obj) {
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
        jctpv6v6v9x64apiJNI.delete_CThostFtdcOptionSelfCloseActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_InvestorID_get(swigCPtr, this);
  }

  public void setOptionSelfCloseActionRef(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_OptionSelfCloseActionRef_set(swigCPtr, this, value);
  }

  public int getOptionSelfCloseActionRef() {
    return jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_OptionSelfCloseActionRef_get(swigCPtr, this);
  }

  public void setOptionSelfCloseRef(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_OptionSelfCloseRef_set(swigCPtr, this, value);
  }

  public String getOptionSelfCloseRef() {
    return jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_OptionSelfCloseRef_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_RequestID_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_SessionID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setOptionSelfCloseSysID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_OptionSelfCloseSysID_set(swigCPtr, this, value);
  }

  public String getOptionSelfCloseSysID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_OptionSelfCloseSysID_get(swigCPtr, this);
  }

  public void setActionFlag(char value) {
    jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_ActionFlag_set(swigCPtr, this, value);
  }

  public char getActionFlag() {
    return jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_ActionFlag_get(swigCPtr, this);
  }

  public void setActionDate(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_ActionDate_set(swigCPtr, this, value);
  }

  public String getActionDate() {
    return jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_ActionDate_get(swigCPtr, this);
  }

  public void setActionTime(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_ActionTime_set(swigCPtr, this, value);
  }

  public String getActionTime() {
    return jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_ActionTime_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_InstallID_get(swigCPtr, this);
  }

  public void setOptionSelfCloseLocalID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_OptionSelfCloseLocalID_set(swigCPtr, this, value);
  }

  public String getOptionSelfCloseLocalID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_OptionSelfCloseLocalID_get(swigCPtr, this);
  }

  public void setActionLocalID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_ActionLocalID_set(swigCPtr, this, value);
  }

  public String getActionLocalID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_ActionLocalID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_ClientID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_BusinessUnit_get(swigCPtr, this);
  }

  public void setOrderActionStatus(char value) {
    jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_OrderActionStatus_set(swigCPtr, this, value);
  }

  public char getOrderActionStatus() {
    return jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_OrderActionStatus_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_UserID_get(swigCPtr, this);
  }

  public void setStatusMsg(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_StatusMsg_set(swigCPtr, this, value);
  }

  public String getStatusMsg() {
    return jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_StatusMsg_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_reserve1_get(swigCPtr, this);
  }

  public void setBranchID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_BranchID_set(swigCPtr, this, value);
  }

  public String getBranchID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_BranchID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_InvestUnitID_get(swigCPtr, this);
  }

  public void setReserve2(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_reserve2_set(swigCPtr, this, value);
  }

  public String getReserve2() {
    return jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_reserve2_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_MacAddress_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_InstrumentID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return jctpv6v6v9x64apiJNI.CThostFtdcOptionSelfCloseActionField_IPAddress_get(swigCPtr, this);
  }

  public CThostFtdcOptionSelfCloseActionField() {
    this(jctpv6v6v9x64apiJNI.new_CThostFtdcOptionSelfCloseActionField(), true);
  }

}
