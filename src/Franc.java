public class Franc extends Money {
    private String currency;
    String currency() {
        return currency;
    }
    Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }
    Franc (int amount) {
        this.amount = amount;
        currency = "CHF";
    }
}
