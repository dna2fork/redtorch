/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v1p1cpv.api;

public class CThostFtdcSyncDeltaExchMarginRateField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSyncDeltaExchMarginRateField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncDeltaExchMarginRateField obj) {
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
        jctpv6v6v1p1cpx64apiJNI.delete_CThostFtdcSyncDeltaExchMarginRateField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcSyncDeltaExchMarginRateField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcSyncDeltaExchMarginRateField_BrokerID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcSyncDeltaExchMarginRateField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcSyncDeltaExchMarginRateField_InstrumentID_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcSyncDeltaExchMarginRateField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcSyncDeltaExchMarginRateField_HedgeFlag_get(swigCPtr, this);
  }

  public void setLongMarginRatioByMoney(double value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcSyncDeltaExchMarginRateField_LongMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getLongMarginRatioByMoney() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcSyncDeltaExchMarginRateField_LongMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setLongMarginRatioByVolume(double value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcSyncDeltaExchMarginRateField_LongMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getLongMarginRatioByVolume() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcSyncDeltaExchMarginRateField_LongMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setShortMarginRatioByMoney(double value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcSyncDeltaExchMarginRateField_ShortMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getShortMarginRatioByMoney() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcSyncDeltaExchMarginRateField_ShortMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setShortMarginRatioByVolume(double value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcSyncDeltaExchMarginRateField_ShortMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getShortMarginRatioByVolume() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcSyncDeltaExchMarginRateField_ShortMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setActionDirection(char value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcSyncDeltaExchMarginRateField_ActionDirection_set(swigCPtr, this, value);
  }

  public char getActionDirection() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcSyncDeltaExchMarginRateField_ActionDirection_get(swigCPtr, this);
  }

  public void setSyncDeltaSequenceNo(int value) {
    jctpv6v6v1p1cpx64apiJNI.CThostFtdcSyncDeltaExchMarginRateField_SyncDeltaSequenceNo_set(swigCPtr, this, value);
  }

  public int getSyncDeltaSequenceNo() {
    return jctpv6v6v1p1cpx64apiJNI.CThostFtdcSyncDeltaExchMarginRateField_SyncDeltaSequenceNo_get(swigCPtr, this);
  }

  public CThostFtdcSyncDeltaExchMarginRateField() {
    this(jctpv6v6v1p1cpx64apiJNI.new_CThostFtdcSyncDeltaExchMarginRateField(), true);
  }

}
