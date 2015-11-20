public class Franc extends Money {
    private String currency;
    String currency() {
        return currency;
    }
    Money times(int multiplier) {
        return Money.franc(amount * multiplier);
    }
    Franc (int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
}
