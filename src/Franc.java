public class Franc extends Money {

    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }
    Franc (int amount, String currency) {
        super(amount, currency);
    }
}
