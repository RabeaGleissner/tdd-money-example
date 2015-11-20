public class Dollar extends Money {
    private String currency;
    String currency() {
        return currency;
    }
    Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }
    Dollar(int amount, String currency) {
        super(amount, currency);
    }
}
