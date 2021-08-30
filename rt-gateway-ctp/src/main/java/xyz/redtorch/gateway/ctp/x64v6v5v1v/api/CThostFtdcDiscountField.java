/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v5v1v.api;

public class CThostFtdcDiscountField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcDiscountField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcDiscountField obj) {
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
        jctpv6v5v1x64apiJNI.delete_CThostFtdcDiscountField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcDiscountField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcDiscountField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    jctpv6v5v1x64apiJNI.CThostFtdcDiscountField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return jctpv6v5v1x64apiJNI.CThostFtdcDiscountField_InvestorRange_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v5v1x64apiJNI.CThostFtdcDiscountField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v5v1x64apiJNI.CThostFtdcDiscountField_InvestorID_get(swigCPtr, this);
  }

  public void setDiscount(double value) {
    jctpv6v5v1x64apiJNI.CThostFtdcDiscountField_Discount_set(swigCPtr, this, value);
  }

  public double getDiscount() {
    return jctpv6v5v1x64apiJNI.CThostFtdcDiscountField_Discount_get(swigCPtr, this);
  }

  public CThostFtdcDiscountField() {
    this(jctpv6v5v1x64apiJNI.new_CThostFtdcDiscountField(), true);
  }

}
