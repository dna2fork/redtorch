/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v9v.api;

public class CThostFtdcSyncDeltaProductStatusField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSyncDeltaProductStatusField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncDeltaProductStatusField obj) {
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
        jctpv6v6v9x64apiJNI.delete_CThostFtdcSyncDeltaProductStatusField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setSyncDeltaSequenceNo(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcSyncDeltaProductStatusField_SyncDeltaSequenceNo_set(swigCPtr, this, value);
  }

  public int getSyncDeltaSequenceNo() {
    return jctpv6v6v9x64apiJNI.CThostFtdcSyncDeltaProductStatusField_SyncDeltaSequenceNo_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcSyncDeltaProductStatusField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcSyncDeltaProductStatusField_ExchangeID_get(swigCPtr, this);
  }

  public void setProductID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcSyncDeltaProductStatusField_ProductID_set(swigCPtr, this, value);
  }

  public String getProductID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcSyncDeltaProductStatusField_ProductID_get(swigCPtr, this);
  }

  public void setProductStatus(char value) {
    jctpv6v6v9x64apiJNI.CThostFtdcSyncDeltaProductStatusField_ProductStatus_set(swigCPtr, this, value);
  }

  public char getProductStatus() {
    return jctpv6v6v9x64apiJNI.CThostFtdcSyncDeltaProductStatusField_ProductStatus_get(swigCPtr, this);
  }

  public CThostFtdcSyncDeltaProductStatusField() {
    this(jctpv6v6v9x64apiJNI.new_CThostFtdcSyncDeltaProductStatusField(), true);
  }

}
