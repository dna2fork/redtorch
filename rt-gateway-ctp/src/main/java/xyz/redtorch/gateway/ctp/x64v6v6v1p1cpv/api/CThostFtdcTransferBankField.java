/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v1p1cpv.api;

public class CThostFtdcTransferBankField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcTransferBankField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTransferBankField obj) {
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
        jctpv6v6v1p1cpx64apiJNI.delete_CThostFtdcTransferBankField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBankID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferBankField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferBankField_BankID_get(swigCPtr, this);
  }

  public void setBankBrchID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferBankField_BankBrchID_set(swigCPtr, this, value);
  }

  public String getBankBrchID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferBankField_BankBrchID_get(swigCPtr, this);
  }

  public void setBankName(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferBankField_BankName_set(swigCPtr, this, value);
  }

  public String getBankName() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferBankField_BankName_get(swigCPtr, this);
  }

  public void setIsActive(int value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferBankField_IsActive_set(swigCPtr, this, value);
  }

  public int getIsActive() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcTransferBankField_IsActive_get(swigCPtr, this);
  }

  public CThostFtdcTransferBankField() {
    this(jctpv6v6v1p1cpx64apiJNI.new_CThostFtdcTransferBankField(), true);
  }

}
