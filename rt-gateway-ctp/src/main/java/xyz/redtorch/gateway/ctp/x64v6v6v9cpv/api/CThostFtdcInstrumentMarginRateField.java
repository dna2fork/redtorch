/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v9cpv.api;

public class CThostFtdcInstrumentMarginRateField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcInstrumentMarginRateField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInstrumentMarginRateField obj) {
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
        jctpv6v6v9cpx64apiJNI.delete_CThostFtdcInstrumentMarginRateField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setReserve1(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcInstrumentMarginRateField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcInstrumentMarginRateField_reserve1_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcInstrumentMarginRateField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcInstrumentMarginRateField_InvestorRange_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcInstrumentMarginRateField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcInstrumentMarginRateField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcInstrumentMarginRateField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcInstrumentMarginRateField_InvestorID_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcInstrumentMarginRateField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcInstrumentMarginRateField_HedgeFlag_get(swigCPtr, this);
  }

  public void setLongMarginRatioByMoney(double value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcInstrumentMarginRateField_LongMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getLongMarginRatioByMoney() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcInstrumentMarginRateField_LongMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setLongMarginRatioByVolume(double value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcInstrumentMarginRateField_LongMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getLongMarginRatioByVolume() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcInstrumentMarginRateField_LongMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setShortMarginRatioByMoney(double value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcInstrumentMarginRateField_ShortMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getShortMarginRatioByMoney() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcInstrumentMarginRateField_ShortMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setShortMarginRatioByVolume(double value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcInstrumentMarginRateField_ShortMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getShortMarginRatioByVolume() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcInstrumentMarginRateField_ShortMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setIsRelative(int value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcInstrumentMarginRateField_IsRelative_set(swigCPtr, this, value);
  }

  public int getIsRelative() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcInstrumentMarginRateField_IsRelative_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcInstrumentMarginRateField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcInstrumentMarginRateField_ExchangeID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcInstrumentMarginRateField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcInstrumentMarginRateField_InvestUnitID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpv6v6v9cpx64apiJNI.CThostFtdcInstrumentMarginRateField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v6v9cpx64apiJNI.CThostFtdcInstrumentMarginRateField_InstrumentID_get(swigCPtr, this);
  }

  public CThostFtdcInstrumentMarginRateField() {
    this(jctpv6v6v9cpx64apiJNI.new_CThostFtdcInstrumentMarginRateField(), true);
  }

}
