/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v1p1v.api;

public class CThostFtdcSyncDeltaInfoField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSyncDeltaInfoField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncDeltaInfoField obj) {
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
        jctpv6v6v1p1x64apiJNI.delete_CThostFtdcSyncDeltaInfoField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setSyncDeltaSequenceNo(int value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInfoField_SyncDeltaSequenceNo_set(swigCPtr, this, value);
  }

  public int getSyncDeltaSequenceNo() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInfoField_SyncDeltaSequenceNo_get(swigCPtr, this);
  }

  public void setSyncDeltaStatus(char value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInfoField_SyncDeltaStatus_set(swigCPtr, this, value);
  }

  public char getSyncDeltaStatus() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInfoField_SyncDeltaStatus_get(swigCPtr, this);
  }

  public void setSyncDescription(String value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInfoField_SyncDescription_set(swigCPtr, this, value);
  }

  public String getSyncDescription() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInfoField_SyncDescription_get(swigCPtr, this);
  }

  public void setIsOnlyTrdDelta(int value) {
    jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInfoField_IsOnlyTrdDelta_set(swigCPtr, this, value);
  }

  public int getIsOnlyTrdDelta() {
    return jctpv6v6v1p1x64apiJNI.CThostFtdcSyncDeltaInfoField_IsOnlyTrdDelta_get(swigCPtr, this);
  }

  public CThostFtdcSyncDeltaInfoField() {
    this(jctpv6v6v1p1x64apiJNI.new_CThostFtdcSyncDeltaInfoField(), true);
  }

}
