public class Franc extends Money {
    private String currency;
    String currency() {
        return currency;
    }
    Money times(int multiplier) {
        return new Franc(amount * multiplier, null);
    }
    Franc (int amount, String currency) {
        this.amount = amount;
        this.currency = "CHF";
    }
}
