public class Dollar extends Money {
    private String currency;
    String currency() {
        return currency;
    }
    Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
    Dollar(int amount) {
        this.amount = amount;
        currency = "USD";
    }
}
