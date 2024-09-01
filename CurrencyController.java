import java.util.HashMap;
import java.util.Map;

public class CurrencyController {
    private Map<String, Currency> currencies;

    public CurrencyController() {
        this.currencies = new HashMap<>();
    }

    public void addCurrency(Currency currency) {
        currencies.put(currency.getName(), currency);
    }

    public void removeCurrency(String currencyName) {
        currencies.remove(currencyName);
    }

    public double convert(String fromCurrency, String toCurrency, double amount) {
        if (!currencies.containsKey(fromCurrency) || !currencies.containsKey(toCurrency)) {
            throw new RuntimeException("One or both currencies are not available");
        }

        double fromExchangeRate = currencies.get(fromCurrency).getExchangeRate();
        double toExchangeRate = currencies.get(toCurrency).getExchangeRate();

        return amount / fromExchangeRate * toExchangeRate;
    }
}