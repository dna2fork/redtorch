/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v19p1v.api;

public class CThostFtdcInstrumentCommissionRateField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcInstrumentCommissionRateField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInstrumentCommissionRateField obj) {
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
        jctpv6v3v19p1x64apiJNI.delete_CThostFtdcInstrumentCommissionRateField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcInstrumentCommissionRateField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcInstrumentCommissionRateField_InstrumentID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcInstrumentCommissionRateField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcInstrumentCommissionRateField_InvestorRange_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcInstrumentCommissionRateField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcInstrumentCommissionRateField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcInstrumentCommissionRateField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcInstrumentCommissionRateField_InvestorID_get(swigCPtr, this);
  }

  public void setOpenRatioByMoney(double value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcInstrumentCommissionRateField_OpenRatioByMoney_set(swigCPtr, this, value);
  }

  public double getOpenRatioByMoney() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcInstrumentCommissionRateField_OpenRatioByMoney_get(swigCPtr, this);
  }

  public void setOpenRatioByVolume(double value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcInstrumentCommissionRateField_OpenRatioByVolume_set(swigCPtr, this, value);
  }

  public double getOpenRatioByVolume() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcInstrumentCommissionRateField_OpenRatioByVolume_get(swigCPtr, this);
  }

  public void setCloseRatioByMoney(double value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcInstrumentCommissionRateField_CloseRatioByMoney_set(swigCPtr, this, value);
  }

  public double getCloseRatioByMoney() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcInstrumentCommissionRateField_CloseRatioByMoney_get(swigCPtr, this);
  }

  public void setCloseRatioByVolume(double value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcInstrumentCommissionRateField_CloseRatioByVolume_set(swigCPtr, this, value);
  }

  public double getCloseRatioByVolume() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcInstrumentCommissionRateField_CloseRatioByVolume_get(swigCPtr, this);
  }

  public void setCloseTodayRatioByMoney(double value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcInstrumentCommissionRateField_CloseTodayRatioByMoney_set(swigCPtr, this, value);
  }

  public double getCloseTodayRatioByMoney() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcInstrumentCommissionRateField_CloseTodayRatioByMoney_get(swigCPtr, this);
  }

  public void setCloseTodayRatioByVolume(double value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcInstrumentCommissionRateField_CloseTodayRatioByVolume_set(swigCPtr, this, value);
  }

  public double getCloseTodayRatioByVolume() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcInstrumentCommissionRateField_CloseTodayRatioByVolume_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcInstrumentCommissionRateField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcInstrumentCommissionRateField_ExchangeID_get(swigCPtr, this);
  }

  public void setBizType(char value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcInstrumentCommissionRateField_BizType_set(swigCPtr, this, value);
  }

  public char getBizType() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcInstrumentCommissionRateField_BizType_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    jctpv6v3v19p1x64apiJNI.CThostFtdcInstrumentCommissionRateField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return jctpv6v3v19p1x64apiJNI.CThostFtdcInstrumentCommissionRateField_InvestUnitID_get(swigCPtr, this);
  }

  public CThostFtdcInstrumentCommissionRateField() {
    this(jctpv6v3v19p1x64apiJNI.new_CThostFtdcInstrumentCommissionRateField(), true);
  }

}
