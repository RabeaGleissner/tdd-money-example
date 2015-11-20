public class Franc extends Money {
    String currency() {
        return "CHF";
    }
    Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }
    Franc (int amount) {
        this.amount = amount;
    }
}
