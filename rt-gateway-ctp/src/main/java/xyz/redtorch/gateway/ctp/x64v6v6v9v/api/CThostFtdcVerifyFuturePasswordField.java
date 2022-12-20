/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v9v.api;

public class CThostFtdcVerifyFuturePasswordField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcVerifyFuturePasswordField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcVerifyFuturePasswordField obj) {
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
        jctpv6v6v9x64apiJNI.delete_CThostFtdcVerifyFuturePasswordField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcVerifyFuturePasswordField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return jctpv6v6v9x64apiJNI.CThostFtdcVerifyFuturePasswordField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcVerifyFuturePasswordField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcVerifyFuturePasswordField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcVerifyFuturePasswordField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcVerifyFuturePasswordField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcVerifyFuturePasswordField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcVerifyFuturePasswordField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcVerifyFuturePasswordField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcVerifyFuturePasswordField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcVerifyFuturePasswordField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return jctpv6v6v9x64apiJNI.CThostFtdcVerifyFuturePasswordField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcVerifyFuturePasswordField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return jctpv6v6v9x64apiJNI.CThostFtdcVerifyFuturePasswordField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcVerifyFuturePasswordField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return jctpv6v6v9x64apiJNI.CThostFtdcVerifyFuturePasswordField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcVerifyFuturePasswordField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpv6v6v9x64apiJNI.CThostFtdcVerifyFuturePasswordField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcVerifyFuturePasswordField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return jctpv6v6v9x64apiJNI.CThostFtdcVerifyFuturePasswordField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    jctpv6v6v9x64apiJNI.CThostFtdcVerifyFuturePasswordField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return jctpv6v6v9x64apiJNI.CThostFtdcVerifyFuturePasswordField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcVerifyFuturePasswordField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcVerifyFuturePasswordField_SessionID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcVerifyFuturePasswordField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcVerifyFuturePasswordField_AccountID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcVerifyFuturePasswordField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return jctpv6v6v9x64apiJNI.CThostFtdcVerifyFuturePasswordField_Password_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcVerifyFuturePasswordField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return jctpv6v6v9x64apiJNI.CThostFtdcVerifyFuturePasswordField_BankAccount_get(swigCPtr, this);
  }

  public void setBankPassWord(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcVerifyFuturePasswordField_BankPassWord_set(swigCPtr, this, value);
  }

  public String getBankPassWord() {
    return jctpv6v6v9x64apiJNI.CThostFtdcVerifyFuturePasswordField_BankPassWord_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcVerifyFuturePasswordField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcVerifyFuturePasswordField_InstallID_get(swigCPtr, this);
  }

  public void setTID(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcVerifyFuturePasswordField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcVerifyFuturePasswordField_TID_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcVerifyFuturePasswordField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcVerifyFuturePasswordField_CurrencyID_get(swigCPtr, this);
  }

  public CThostFtdcVerifyFuturePasswordField() {
    this(jctpv6v6v9x64apiJNI.new_CThostFtdcVerifyFuturePasswordField(), true);
  }

}
