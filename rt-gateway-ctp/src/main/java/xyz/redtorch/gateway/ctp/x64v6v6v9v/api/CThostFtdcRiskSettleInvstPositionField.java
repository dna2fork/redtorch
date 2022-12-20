/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v6v9v.api;

public class CThostFtdcRiskSettleInvstPositionField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcRiskSettleInvstPositionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcRiskSettleInvstPositionField obj) {
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
        jctpv6v6v9x64apiJNI.delete_CThostFtdcRiskSettleInvstPositionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_InstrumentID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_InvestorID_get(swigCPtr, this);
  }

  public void setPosiDirection(char value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_PosiDirection_set(swigCPtr, this, value);
  }

  public char getPosiDirection() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_PosiDirection_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_HedgeFlag_get(swigCPtr, this);
  }

  public void setPositionDate(char value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_PositionDate_set(swigCPtr, this, value);
  }

  public char getPositionDate() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_PositionDate_get(swigCPtr, this);
  }

  public void setYdPosition(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_YdPosition_set(swigCPtr, this, value);
  }

  public int getYdPosition() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_YdPosition_get(swigCPtr, this);
  }

  public void setPosition(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_Position_set(swigCPtr, this, value);
  }

  public int getPosition() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_Position_get(swigCPtr, this);
  }

  public void setLongFrozen(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_LongFrozen_set(swigCPtr, this, value);
  }

  public int getLongFrozen() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_LongFrozen_get(swigCPtr, this);
  }

  public void setShortFrozen(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_ShortFrozen_set(swigCPtr, this, value);
  }

  public int getShortFrozen() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_ShortFrozen_get(swigCPtr, this);
  }

  public void setLongFrozenAmount(double value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_LongFrozenAmount_set(swigCPtr, this, value);
  }

  public double getLongFrozenAmount() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_LongFrozenAmount_get(swigCPtr, this);
  }

  public void setShortFrozenAmount(double value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_ShortFrozenAmount_set(swigCPtr, this, value);
  }

  public double getShortFrozenAmount() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_ShortFrozenAmount_get(swigCPtr, this);
  }

  public void setOpenVolume(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_OpenVolume_set(swigCPtr, this, value);
  }

  public int getOpenVolume() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_OpenVolume_get(swigCPtr, this);
  }

  public void setCloseVolume(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_CloseVolume_set(swigCPtr, this, value);
  }

  public int getCloseVolume() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_CloseVolume_get(swigCPtr, this);
  }

  public void setOpenAmount(double value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_OpenAmount_set(swigCPtr, this, value);
  }

  public double getOpenAmount() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_OpenAmount_get(swigCPtr, this);
  }

  public void setCloseAmount(double value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_CloseAmount_set(swigCPtr, this, value);
  }

  public double getCloseAmount() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_CloseAmount_get(swigCPtr, this);
  }

  public void setPositionCost(double value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_PositionCost_set(swigCPtr, this, value);
  }

  public double getPositionCost() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_PositionCost_get(swigCPtr, this);
  }

  public void setPreMargin(double value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_PreMargin_set(swigCPtr, this, value);
  }

  public double getPreMargin() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_PreMargin_get(swigCPtr, this);
  }

  public void setUseMargin(double value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_UseMargin_set(swigCPtr, this, value);
  }

  public double getUseMargin() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_UseMargin_get(swigCPtr, this);
  }

  public void setFrozenMargin(double value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_FrozenMargin_set(swigCPtr, this, value);
  }

  public double getFrozenMargin() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_FrozenMargin_get(swigCPtr, this);
  }

  public void setFrozenCash(double value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_FrozenCash_set(swigCPtr, this, value);
  }

  public double getFrozenCash() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_FrozenCash_get(swigCPtr, this);
  }

  public void setFrozenCommission(double value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_FrozenCommission_set(swigCPtr, this, value);
  }

  public double getFrozenCommission() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_FrozenCommission_get(swigCPtr, this);
  }

  public void setCashIn(double value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_CashIn_set(swigCPtr, this, value);
  }

  public double getCashIn() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_CashIn_get(swigCPtr, this);
  }

  public void setCommission(double value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_Commission_set(swigCPtr, this, value);
  }

  public double getCommission() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_Commission_get(swigCPtr, this);
  }

  public void setCloseProfit(double value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_CloseProfit_set(swigCPtr, this, value);
  }

  public double getCloseProfit() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_CloseProfit_get(swigCPtr, this);
  }

  public void setPositionProfit(double value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_PositionProfit_set(swigCPtr, this, value);
  }

  public double getPositionProfit() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_PositionProfit_get(swigCPtr, this);
  }

  public void setPreSettlementPrice(double value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_PreSettlementPrice_set(swigCPtr, this, value);
  }

  public double getPreSettlementPrice() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_PreSettlementPrice_get(swigCPtr, this);
  }

  public void setSettlementPrice(double value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_SettlementPrice_set(swigCPtr, this, value);
  }

  public double getSettlementPrice() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_SettlementPrice_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_SettlementID_get(swigCPtr, this);
  }

  public void setOpenCost(double value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_OpenCost_set(swigCPtr, this, value);
  }

  public double getOpenCost() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_OpenCost_get(swigCPtr, this);
  }

  public void setExchangeMargin(double value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_ExchangeMargin_set(swigCPtr, this, value);
  }

  public double getExchangeMargin() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_ExchangeMargin_get(swigCPtr, this);
  }

  public void setCombPosition(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_CombPosition_set(swigCPtr, this, value);
  }

  public int getCombPosition() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_CombPosition_get(swigCPtr, this);
  }

  public void setCombLongFrozen(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_CombLongFrozen_set(swigCPtr, this, value);
  }

  public int getCombLongFrozen() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_CombLongFrozen_get(swigCPtr, this);
  }

  public void setCombShortFrozen(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_CombShortFrozen_set(swigCPtr, this, value);
  }

  public int getCombShortFrozen() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_CombShortFrozen_get(swigCPtr, this);
  }

  public void setCloseProfitByDate(double value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_CloseProfitByDate_set(swigCPtr, this, value);
  }

  public double getCloseProfitByDate() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_CloseProfitByDate_get(swigCPtr, this);
  }

  public void setCloseProfitByTrade(double value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_CloseProfitByTrade_set(swigCPtr, this, value);
  }

  public double getCloseProfitByTrade() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_CloseProfitByTrade_get(swigCPtr, this);
  }

  public void setTodayPosition(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_TodayPosition_set(swigCPtr, this, value);
  }

  public int getTodayPosition() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_TodayPosition_get(swigCPtr, this);
  }

  public void setMarginRateByMoney(double value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_MarginRateByMoney_set(swigCPtr, this, value);
  }

  public double getMarginRateByMoney() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_MarginRateByMoney_get(swigCPtr, this);
  }

  public void setMarginRateByVolume(double value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_MarginRateByVolume_set(swigCPtr, this, value);
  }

  public double getMarginRateByVolume() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_MarginRateByVolume_get(swigCPtr, this);
  }

  public void setStrikeFrozen(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_StrikeFrozen_set(swigCPtr, this, value);
  }

  public int getStrikeFrozen() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_StrikeFrozen_get(swigCPtr, this);
  }

  public void setStrikeFrozenAmount(double value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_StrikeFrozenAmount_set(swigCPtr, this, value);
  }

  public double getStrikeFrozenAmount() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_StrikeFrozenAmount_get(swigCPtr, this);
  }

  public void setAbandonFrozen(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_AbandonFrozen_set(swigCPtr, this, value);
  }

  public int getAbandonFrozen() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_AbandonFrozen_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_ExchangeID_get(swigCPtr, this);
  }

  public void setYdStrikeFrozen(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_YdStrikeFrozen_set(swigCPtr, this, value);
  }

  public int getYdStrikeFrozen() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_YdStrikeFrozen_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_InvestUnitID_get(swigCPtr, this);
  }

  public void setPositionCostOffset(double value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_PositionCostOffset_set(swigCPtr, this, value);
  }

  public double getPositionCostOffset() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_PositionCostOffset_get(swigCPtr, this);
  }

  public void setTasPosition(int value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_TasPosition_set(swigCPtr, this, value);
  }

  public int getTasPosition() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_TasPosition_get(swigCPtr, this);
  }

  public void setTasPositionCost(double value) {
    jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_TasPositionCost_set(swigCPtr, this, value);
  }

  public double getTasPositionCost() {
    return jctpv6v6v9x64apiJNI.CThostFtdcRiskSettleInvstPositionField_TasPositionCost_get(swigCPtr, this);
  }

  public CThostFtdcRiskSettleInvstPositionField() {
    this(jctpv6v6v9x64apiJNI.new_CThostFtdcRiskSettleInvstPositionField(), true);
  }

}
