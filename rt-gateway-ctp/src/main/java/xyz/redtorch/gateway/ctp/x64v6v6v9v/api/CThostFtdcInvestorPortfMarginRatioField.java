/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v9v.api;

public class CThostFtdcInvestorPortfMarginRatioField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcInvestorPortfMarginRatioField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInvestorPortfMarginRatioField obj) {
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
        jctpv6v6v9x64apiJNI.delete_CThostFtdcInvestorPortfMarginRatioField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInvestorRange(char value) {
    jctpv6v6v9x64apiJNI.CThostFtdcInvestorPortfMarginRatioField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return jctpv6v6v9x64apiJNI.CThostFtdcInvestorPortfMarginRatioField_InvestorRange_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcInvestorPortfMarginRatioField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcInvestorPortfMarginRatioField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcInvestorPortfMarginRatioField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcInvestorPortfMarginRatioField_InvestorID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcInvestorPortfMarginRatioField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcInvestorPortfMarginRatioField_ExchangeID_get(swigCPtr, this);
  }

  public void setMarginRatio(double value) {
    jctpv6v6v9x64apiJNI.CThostFtdcInvestorPortfMarginRatioField_MarginRatio_set(swigCPtr, this, value);
  }

  public double getMarginRatio() {
    return jctpv6v6v9x64apiJNI.CThostFtdcInvestorPortfMarginRatioField_MarginRatio_get(swigCPtr, this);
  }

  public CThostFtdcInvestorPortfMarginRatioField() {
    this(jctpv6v6v9x64apiJNI.new_CThostFtdcInvestorPortfMarginRatioField(), true);
  }

}
