/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v9v.api;

public class CThostFtdcCombActionField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcCombActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcCombActionField obj) {
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
        jctpv6v6v9x64apiJNI.delete_CThostFtdcCombActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_InvestorID_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_reserve1_get(swigCPtr, this);
  }

  public void setCombActionRef(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_CombActionRef_set(swigCPtr, this, value);
  }

  public String getCombActionRef() {
    return jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_CombActionRef_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_UserID_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_Direction_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_Volume_get(swigCPtr, this);
  }

  public void setCombDirection(char value) {
    jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_CombDirection_set(swigCPtr, this, value);
  }

  public char getCombDirection() {
    return jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_CombDirection_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_HedgeFlag_get(swigCPtr, this);
  }

  public void setActionLocalID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_ActionLocalID_set(swigCPtr, this, value);
  }

  public String getActionLocalID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_ActionLocalID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_ClientID_get(swigCPtr, this);
  }

  public void setReserve2(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_reserve2_set(swigCPtr, this, value);
  }

  public String getReserve2() {
    return jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_reserve2_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_InstallID_get(swigCPtr, this);
  }

  public void setActionStatus(char value) {
    jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_ActionStatus_set(swigCPtr, this, value);
  }

  public char getActionStatus() {
    return jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_ActionStatus_get(swigCPtr, this);
  }

  public void setNotifySequence(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_NotifySequence_set(swigCPtr, this, value);
  }

  public int getNotifySequence() {
    return jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_NotifySequence_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_SettlementID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_SequenceNo_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_SessionID_get(swigCPtr, this);
  }

  public void setUserProductInfo(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_UserProductInfo_set(swigCPtr, this, value);
  }

  public String getUserProductInfo() {
    return jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_UserProductInfo_get(swigCPtr, this);
  }

  public void setStatusMsg(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_StatusMsg_set(swigCPtr, this, value);
  }

  public String getStatusMsg() {
    return jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_StatusMsg_get(swigCPtr, this);
  }

  public void setReserve3(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_reserve3_set(swigCPtr, this, value);
  }

  public String getReserve3() {
    return jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_reserve3_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_MacAddress_get(swigCPtr, this);
  }

  public void setComTradeID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_ComTradeID_set(swigCPtr, this, value);
  }

  public String getComTradeID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_ComTradeID_get(swigCPtr, this);
  }

  public void setBranchID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_BranchID_set(swigCPtr, this, value);
  }

  public String getBranchID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_BranchID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_InvestUnitID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_InstrumentID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return jctpv6v6v9x64apiJNI.CThostFtdcCombActionField_IPAddress_get(swigCPtr, this);
  }

  public CThostFtdcCombActionField() {
    this(jctpv6v6v9x64apiJNI.new_CThostFtdcCombActionField(), true);
  }

}
