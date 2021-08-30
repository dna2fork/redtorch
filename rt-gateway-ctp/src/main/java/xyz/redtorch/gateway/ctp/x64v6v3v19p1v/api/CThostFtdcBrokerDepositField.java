/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v19p1v.api;

public class CThostFtdcBrokerDepositField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcBrokerDepositField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcBrokerDepositField obj) {
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
        jctpv6v3v19p1x64apiJNI.delete_CThostFtdcBrokerDepositField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcBrokerDepositField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcBrokerDepositField_TradingDay_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcBrokerDepositField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcBrokerDepositField_BrokerID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcBrokerDepositField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcBrokerDepositField_ParticipantID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcBrokerDepositField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcBrokerDepositField_ExchangeID_get(swigCPtr, this);
  }

  public void setPreBalance(double value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcBrokerDepositField_PreBalance_set(swigCPtr, this, value);
  }

  public double getPreBalance() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcBrokerDepositField_PreBalance_get(swigCPtr, this);
  }

  public void setCurrMargin(double value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcBrokerDepositField_CurrMargin_set(swigCPtr, this, value);
  }

  public double getCurrMargin() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcBrokerDepositField_CurrMargin_get(swigCPtr, this);
  }

  public void setCloseProfit(double value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcBrokerDepositField_CloseProfit_set(swigCPtr, this, value);
  }

  public double getCloseProfit() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcBrokerDepositField_CloseProfit_get(swigCPtr, this);
  }

  public void setBalance(double value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcBrokerDepositField_Balance_set(swigCPtr, this, value);
  }

  public double getBalance() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcBrokerDepositField_Balance_get(swigCPtr, this);
  }

  public void setDeposit(double value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcBrokerDepositField_Deposit_set(swigCPtr, this, value);
  }

  public double getDeposit() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcBrokerDepositField_Deposit_get(swigCPtr, this);
  }

  public void setWithdraw(double value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcBrokerDepositField_Withdraw_set(swigCPtr, this, value);
  }

  public double getWithdraw() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcBrokerDepositField_Withdraw_get(swigCPtr, this);
  }

  public void setAvailable(double value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcBrokerDepositField_Available_set(swigCPtr, this, value);
  }

  public double getAvailable() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcBrokerDepositField_Available_get(swigCPtr, this);
  }

  public void setReserve(double value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcBrokerDepositField_Reserve_set(swigCPtr, this, value);
  }

  public double getReserve() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcBrokerDepositField_Reserve_get(swigCPtr, this);
  }

  public void setFrozenMargin(double value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcBrokerDepositField_FrozenMargin_set(swigCPtr, this, value);
  }

  public double getFrozenMargin() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcBrokerDepositField_FrozenMargin_get(swigCPtr, this);
  }

  public CThostFtdcBrokerDepositField() {
    this(jctpv6v3v19p1x64apiJNI.new_CThostFtdcBrokerDepositField(), true);
  }

}
