package org.yuhangz.input.exchange;

import org.yuhangz.input.ApiParameter;

/**
 * The currency to be converted in the ForeignExchange converter
 */
public class ToCurrency implements ApiParameter {
  private String toCurrency;

  public ToCurrency(String toCurrency) {
    this.toCurrency = toCurrency;
  }

  @Override
  public String getKey() {
    return "to_currency";
  }

  @Override
  public String getValue() {
    return toCurrency;
  }

}
