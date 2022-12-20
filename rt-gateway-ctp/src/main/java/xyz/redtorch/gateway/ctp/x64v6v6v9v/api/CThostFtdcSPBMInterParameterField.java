/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v9v.api;

public class CThostFtdcSPBMInterParameterField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSPBMInterParameterField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSPBMInterParameterField obj) {
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
        jctpv6v6v9x64apiJNI.delete_CThostFtdcSPBMInterParameterField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcSPBMInterParameterField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpv6v6v9x64apiJNI.CThostFtdcSPBMInterParameterField_TradingDay_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcSPBMInterParameterField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcSPBMInterParameterField_ExchangeID_get(swigCPtr, this);
  }

  public void setSpreadId(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcSPBMInterParameterField_SpreadId_set(swigCPtr, this, value);
  }

  public int getSpreadId() {
    return jctpv6v6v9x64apiJNI.CThostFtdcSPBMInterParameterField_SpreadId_get(swigCPtr, this);
  }

  public void setInterRateZ(double value) {
    jctpv6v6v9x64apiJNI.CThostFtdcSPBMInterParameterField_InterRateZ_set(swigCPtr, this, value);
  }

  public double getInterRateZ() {
    return jctpv6v6v9x64apiJNI.CThostFtdcSPBMInterParameterField_InterRateZ_get(swigCPtr, this);
  }

  public void setLeg1ProdFamilyCode(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcSPBMInterParameterField_Leg1ProdFamilyCode_set(swigCPtr, this, value);
  }

  public String getLeg1ProdFamilyCode() {
    return jctpv6v6v9x64apiJNI.CThostFtdcSPBMInterParameterField_Leg1ProdFamilyCode_get(swigCPtr, this);
  }

  public void setLeg2ProdFamilyCode(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcSPBMInterParameterField_Leg2ProdFamilyCode_set(swigCPtr, this, value);
  }

  public String getLeg2ProdFamilyCode() {
    return jctpv6v6v9x64apiJNI.CThostFtdcSPBMInterParameterField_Leg2ProdFamilyCode_get(swigCPtr, this);
  }

  public CThostFtdcSPBMInterParameterField() {
    this(jctpv6v6v9x64apiJNI.new_CThostFtdcSPBMInterParameterField(), true);
  }

}
