public class Dollar extends Money {

    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }
    Dollar(int amount, String currency) {
        super(amount, currency);
    }
}
