/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v9v.api;

public class CThostFtdcMarketDataAsk45Field {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcMarketDataAsk45Field(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcMarketDataAsk45Field obj) {
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
        jctpv6v6v9x64apiJNI.delete_CThostFtdcMarketDataAsk45Field(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setAskPrice4(double value) {
    jctpv6v6v9x64apiJNI.CThostFtdcMarketDataAsk45Field_AskPrice4_set(swigCPtr, this, value);
  }

  public double getAskPrice4() {
    return jctpv6v6v9x64apiJNI.CThostFtdcMarketDataAsk45Field_AskPrice4_get(swigCPtr, this);
  }

  public void setAskVolume4(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcMarketDataAsk45Field_AskVolume4_set(swigCPtr, this, value);
  }

  public int getAskVolume4() {
    return jctpv6v6v9x64apiJNI.CThostFtdcMarketDataAsk45Field_AskVolume4_get(swigCPtr, this);
  }

  public void setAskPrice5(double value) {
    jctpv6v6v9x64apiJNI.CThostFtdcMarketDataAsk45Field_AskPrice5_set(swigCPtr, this, value);
  }

  public double getAskPrice5() {
    return jctpv6v6v9x64apiJNI.CThostFtdcMarketDataAsk45Field_AskPrice5_get(swigCPtr, this);
  }

  public void setAskVolume5(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcMarketDataAsk45Field_AskVolume5_set(swigCPtr, this, value);
  }

  public int getAskVolume5() {
    return jctpv6v6v9x64apiJNI.CThostFtdcMarketDataAsk45Field_AskVolume5_get(swigCPtr, this);
  }

  public CThostFtdcMarketDataAsk45Field() {
    this(jctpv6v6v9x64apiJNI.new_CThostFtdcMarketDataAsk45Field(), true);
  }

}
