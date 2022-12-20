/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v9cpv.api;

public class CThostFtdcRspTransferField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcRspTransferField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcRspTransferField obj) {
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
        jctpv6v6v9cpx64apiJNI.delete_CThostFtdcRspTransferField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_SessionID_get(swigCPtr, this);
  }

  public void setCustomerName(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_CustomerName_set(swigCPtr, this, value);
  }

  public String getCustomerName() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_CustomerName_get(swigCPtr, this);
  }

  public void setIdCardType(char value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_IdCardType_set(swigCPtr, this, value);
  }

  public char getIdCardType() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_IdCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setCustType(char value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_CustType_set(swigCPtr, this, value);
  }

  public char getCustType() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_CustType_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_BankAccount_get(swigCPtr, this);
  }

  public void setBankPassWord(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_BankPassWord_set(swigCPtr, this, value);
  }

  public String getBankPassWord() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_BankPassWord_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_AccountID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_Password_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_InstallID_get(swigCPtr, this);
  }

  public void setFutureSerial(int value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_FutureSerial_set(swigCPtr, this, value);
  }

  public int getFutureSerial() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_FutureSerial_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_UserID_get(swigCPtr, this);
  }

  public void setVerifyCertNoFlag(char value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_VerifyCertNoFlag_set(swigCPtr, this, value);
  }

  public char getVerifyCertNoFlag() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_VerifyCertNoFlag_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_CurrencyID_get(swigCPtr, this);
  }

  public void setTradeAmount(double value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_TradeAmount_set(swigCPtr, this, value);
  }

  public double getTradeAmount() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_TradeAmount_get(swigCPtr, this);
  }

  public void setFutureFetchAmount(double value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_FutureFetchAmount_set(swigCPtr, this, value);
  }

  public double getFutureFetchAmount() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_FutureFetchAmount_get(swigCPtr, this);
  }

  public void setFeePayFlag(char value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_FeePayFlag_set(swigCPtr, this, value);
  }

  public char getFeePayFlag() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_FeePayFlag_get(swigCPtr, this);
  }

  public void setCustFee(double value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_CustFee_set(swigCPtr, this, value);
  }

  public double getCustFee() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_CustFee_get(swigCPtr, this);
  }

  public void setBrokerFee(double value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_BrokerFee_set(swigCPtr, this, value);
  }

  public double getBrokerFee() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_BrokerFee_get(swigCPtr, this);
  }

  public void setMessage(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_Message_set(swigCPtr, this, value);
  }

  public String getMessage() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_Message_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_Digest_get(swigCPtr, this);
  }

  public void setBankAccType(char value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_BankAccType_set(swigCPtr, this, value);
  }

  public char getBankAccType() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_BankAccType_get(swigCPtr, this);
  }

  public void setDeviceID(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_DeviceID_set(swigCPtr, this, value);
  }

  public String getDeviceID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_DeviceID_get(swigCPtr, this);
  }

  public void setBankSecuAccType(char value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_BankSecuAccType_set(swigCPtr, this, value);
  }

  public char getBankSecuAccType() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_BankSecuAccType_get(swigCPtr, this);
  }

  public void setBrokerIDByBank(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_BrokerIDByBank_set(swigCPtr, this, value);
  }

  public String getBrokerIDByBank() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_BrokerIDByBank_get(swigCPtr, this);
  }

  public void setBankSecuAcc(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_BankSecuAcc_set(swigCPtr, this, value);
  }

  public String getBankSecuAcc() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_BankSecuAcc_get(swigCPtr, this);
  }

  public void setBankPwdFlag(char value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_BankPwdFlag_set(swigCPtr, this, value);
  }

  public char getBankPwdFlag() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_BankPwdFlag_get(swigCPtr, this);
  }

  public void setSecuPwdFlag(char value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_SecuPwdFlag_set(swigCPtr, this, value);
  }

  public char getSecuPwdFlag() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_SecuPwdFlag_get(swigCPtr, this);
  }

  public void setOperNo(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_OperNo_set(swigCPtr, this, value);
  }

  public String getOperNo() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_OperNo_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_RequestID_get(swigCPtr, this);
  }

  public void setTID(int value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_TID_get(swigCPtr, this);
  }

  public void setTransferStatus(char value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_TransferStatus_set(swigCPtr, this, value);
  }

  public char getTransferStatus() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_TransferStatus_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_ErrorMsg_get(swigCPtr, this);
  }

  public void setLongCustomerName(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_LongCustomerName_set(swigCPtr, this, value);
  }

  public String getLongCustomerName() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcRspTransferField_LongCustomerName_get(swigCPtr, this);
  }

  public CThostFtdcRspTransferField() {
    this(jctpv6v6v9cpx64apiJNI.new_CThostFtdcRspTransferField(), true);
  }

}
