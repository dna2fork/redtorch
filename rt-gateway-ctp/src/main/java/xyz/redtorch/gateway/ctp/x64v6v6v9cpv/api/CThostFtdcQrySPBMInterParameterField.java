/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v9cpv.api;

public class CThostFtdcQrySPBMInterParameterField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQrySPBMInterParameterField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQrySPBMInterParameterField obj) {
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
        jctpv6v6v9cpx64apiJNI.delete_CThostFtdcQrySPBMInterParameterField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcQrySPBMInterParameterField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcQrySPBMInterParameterField_ExchangeID_get(swigCPtr, this);
  }

  public void setLeg1ProdFamilyCode(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcQrySPBMInterParameterField_Leg1ProdFamilyCode_set(swigCPtr, this, value);
  }

  public String getLeg1ProdFamilyCode() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcQrySPBMInterParameterField_Leg1ProdFamilyCode_get(swigCPtr, this);
  }

  public void setLeg2ProdFamilyCode(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcQrySPBMInterParameterField_Leg2ProdFamilyCode_set(swigCPtr, this, value);
  }

  public String getLeg2ProdFamilyCode() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcQrySPBMInterParameterField_Leg2ProdFamilyCode_get(swigCPtr, this);
  }

  public CThostFtdcQrySPBMInterParameterField() {
    this(jctpv6v6v9cpx64apiJNI.new_CThostFtdcQrySPBMInterParameterField(), true);
  }

}
