package emilia.currency;

import java.util.Map;

/**
 * Sample:
 *
 * {
 *   "disclaimer": "Usage subject to terms: https://openexchangerates.org/terms", <- ignored
 *   "license": "https://openexchangerates.org/license", <- ignored
 *   "timestamp": 1608595199,
 *   "base": "USD",
 *   "rates": {
 *     "AED": 3.6731,
 *     "AFN": 77.149997,
 *      // more
 *   }
 * }
 */
public class CurrencyRates {

    private Integer timestamp;
    private String base;
    private Map<String, Double> exchangeRates;

    public CurrencyRates() {
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Map<String, Double> getExchangeRates() {
        return exchangeRates;
    }

    public void setExchangeRates(Map<String, Double> exchangeRates) {
        this.exchangeRates = exchangeRates;
    }
}