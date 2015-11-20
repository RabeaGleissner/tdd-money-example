public class Dollar extends Money {
    String currency() {
        return "USD";
    }
    Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
    Dollar(int amount) {
        this.amount = amount;
    }
}
