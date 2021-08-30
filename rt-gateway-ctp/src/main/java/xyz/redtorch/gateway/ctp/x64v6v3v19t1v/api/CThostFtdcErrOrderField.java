/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v19t1v.api;

public class CThostFtdcErrOrderField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcErrOrderField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcErrOrderField obj) {
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
        jctpv6v3v19t1x64apiJNI.delete_CThostFtdcErrOrderField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_InstrumentID_get(swigCPtr, this);
  }

  public void setOrderRef(String value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_OrderRef_set(swigCPtr, this, value);
  }

  public String getOrderRef() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_OrderRef_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_UserID_get(swigCPtr, this);
  }

  public void setOrderPriceType(char value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_OrderPriceType_set(swigCPtr, this, value);
  }

  public char getOrderPriceType() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_OrderPriceType_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_Direction_get(swigCPtr, this);
  }

  public void setCombOffsetFlag(String value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_CombOffsetFlag_set(swigCPtr, this, value);
  }

  public String getCombOffsetFlag() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_CombOffsetFlag_get(swigCPtr, this);
  }

  public void setCombHedgeFlag(String value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_CombHedgeFlag_set(swigCPtr, this, value);
  }

  public String getCombHedgeFlag() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_CombHedgeFlag_get(swigCPtr, this);
  }

  public void setLimitPrice(double value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_LimitPrice_set(swigCPtr, this, value);
  }

  public double getLimitPrice() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_LimitPrice_get(swigCPtr, this);
  }

  public void setVolumeTotalOriginal(int value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_VolumeTotalOriginal_set(swigCPtr, this, value);
  }

  public int getVolumeTotalOriginal() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_VolumeTotalOriginal_get(swigCPtr, this);
  }

  public void setTimeCondition(char value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_TimeCondition_set(swigCPtr, this, value);
  }

  public char getTimeCondition() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_TimeCondition_get(swigCPtr, this);
  }

  public void setGTDDate(String value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_GTDDate_set(swigCPtr, this, value);
  }

  public String getGTDDate() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_GTDDate_get(swigCPtr, this);
  }

  public void setVolumeCondition(char value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_VolumeCondition_set(swigCPtr, this, value);
  }

  public char getVolumeCondition() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_VolumeCondition_get(swigCPtr, this);
  }

  public void setMinVolume(int value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_MinVolume_set(swigCPtr, this, value);
  }

  public int getMinVolume() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_MinVolume_get(swigCPtr, this);
  }

  public void setContingentCondition(char value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_ContingentCondition_set(swigCPtr, this, value);
  }

  public char getContingentCondition() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_ContingentCondition_get(swigCPtr, this);
  }

  public void setStopPrice(double value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_StopPrice_set(swigCPtr, this, value);
  }

  public double getStopPrice() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_StopPrice_get(swigCPtr, this);
  }

  public void setForceCloseReason(char value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_ForceCloseReason_set(swigCPtr, this, value);
  }

  public char getForceCloseReason() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_ForceCloseReason_get(swigCPtr, this);
  }

  public void setIsAutoSuspend(int value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_IsAutoSuspend_set(swigCPtr, this, value);
  }

  public int getIsAutoSuspend() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_IsAutoSuspend_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_BusinessUnit_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_RequestID_get(swigCPtr, this);
  }

  public void setUserForceClose(int value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_UserForceClose_set(swigCPtr, this, value);
  }

  public int getUserForceClose() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_UserForceClose_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_ErrorMsg_get(swigCPtr, this);
  }

  public void setIsSwapOrder(int value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_IsSwapOrder_set(swigCPtr, this, value);
  }

  public int getIsSwapOrder() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_IsSwapOrder_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_ExchangeID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_InvestUnitID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_AccountID_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_CurrencyID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_ClientID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return jctpv6v3v19t1x64apiJNI.CThostFtdcErrOrderField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcErrOrderField() {
    this(jctpv6v3v19t1x64apiJNI.new_CThostFtdcErrOrderField(), true);
  }

}
