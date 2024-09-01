public class Main {
    public static void main(String[] args) {
        CurrencyController controller = new CurrencyController();

        
        Currency usd = new Currency("USD", 1.0);
        Currency eur = new Currency("EUR", 0.88);
        Currency gbp = new Currency("GBP", 0.76);

        
        controller.addCurrency(usd);
        controller.addCurrency(eur);
        controller.addCurrency(gbp);

        
        double amount = 100;
        System.out.println(amount + " USD is equal to " + controller.convert("USD", "EUR", amount) + " EUR");
        System.out.println(amount + " EUR is equal to " + controller.convert("EUR", "GBP", amount) + " GBP");
        System.out.println(amount + " GBP is equal to " + controller.convert("GBP", "USD", amount) + " USD");
    }
}