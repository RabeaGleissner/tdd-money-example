public class Franc extends Money {

    Money times(int multiplier) {
        return new Franc(amount * multiplier, "CHF");
    }
    Franc (int amount, String currency) {
        super(amount, currency);
    }
}
