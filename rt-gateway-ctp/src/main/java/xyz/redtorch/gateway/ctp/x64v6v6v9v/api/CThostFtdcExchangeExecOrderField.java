/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v9v.api;

public class CThostFtdcExchangeExecOrderField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcExchangeExecOrderField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeExecOrderField obj) {
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
        jctpv6v6v9x64apiJNI.delete_CThostFtdcExchangeExecOrderField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setVolume(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_Volume_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_RequestID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_BusinessUnit_get(swigCPtr, this);
  }

  public void setOffsetFlag(char value) {
    jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_OffsetFlag_set(swigCPtr, this, value);
  }

  public char getOffsetFlag() {
    return jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_OffsetFlag_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_HedgeFlag_get(swigCPtr, this);
  }

  public void setActionType(char value) {
    jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_ActionType_set(swigCPtr, this, value);
  }

  public char getActionType() {
    return jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_ActionType_get(swigCPtr, this);
  }

  public void setPosiDirection(char value) {
    jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_PosiDirection_set(swigCPtr, this, value);
  }

  public char getPosiDirection() {
    return jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_PosiDirection_get(swigCPtr, this);
  }

  public void setReservePositionFlag(char value) {
    jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_ReservePositionFlag_set(swigCPtr, this, value);
  }

  public char getReservePositionFlag() {
    return jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_ReservePositionFlag_get(swigCPtr, this);
  }

  public void setCloseFlag(char value) {
    jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_CloseFlag_set(swigCPtr, this, value);
  }

  public char getCloseFlag() {
    return jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_CloseFlag_get(swigCPtr, this);
  }

  public void setExecOrderLocalID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_ExecOrderLocalID_set(swigCPtr, this, value);
  }

  public String getExecOrderLocalID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_ExecOrderLocalID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_ExchangeID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_ClientID_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_reserve1_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_InstallID_get(swigCPtr, this);
  }

  public void setOrderSubmitStatus(char value) {
    jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_OrderSubmitStatus_set(swigCPtr, this, value);
  }

  public char getOrderSubmitStatus() {
    return jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_OrderSubmitStatus_get(swigCPtr, this);
  }

  public void setNotifySequence(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_NotifySequence_set(swigCPtr, this, value);
  }

  public int getNotifySequence() {
    return jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_NotifySequence_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_SettlementID_get(swigCPtr, this);
  }

  public void setExecOrderSysID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_ExecOrderSysID_set(swigCPtr, this, value);
  }

  public String getExecOrderSysID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_ExecOrderSysID_get(swigCPtr, this);
  }

  public void setInsertDate(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_InsertDate_set(swigCPtr, this, value);
  }

  public String getInsertDate() {
    return jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_InsertDate_get(swigCPtr, this);
  }

  public void setInsertTime(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_InsertTime_set(swigCPtr, this, value);
  }

  public String getInsertTime() {
    return jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_InsertTime_get(swigCPtr, this);
  }

  public void setCancelTime(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_CancelTime_set(swigCPtr, this, value);
  }

  public String getCancelTime() {
    return jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_CancelTime_get(swigCPtr, this);
  }

  public void setExecResult(char value) {
    jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_ExecResult_set(swigCPtr, this, value);
  }

  public char getExecResult() {
    return jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_ExecResult_get(swigCPtr, this);
  }

  public void setClearingPartID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_ClearingPartID_set(swigCPtr, this, value);
  }

  public String getClearingPartID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_ClearingPartID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_SequenceNo_get(swigCPtr, this);
  }

  public void setBranchID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_BranchID_set(swigCPtr, this, value);
  }

  public String getBranchID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_BranchID_get(swigCPtr, this);
  }

  public void setReserve2(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_reserve2_set(swigCPtr, this, value);
  }

  public String getReserve2() {
    return jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_reserve2_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_MacAddress_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return jctpv6v6v9x64apiJNI.CThostFtdcExchangeExecOrderField_IPAddress_get(swigCPtr, this);
  }

  public CThostFtdcExchangeExecOrderField() {
    this(jctpv6v6v9x64apiJNI.new_CThostFtdcExchangeExecOrderField(), true);
  }

}
