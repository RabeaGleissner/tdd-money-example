public class Dollar extends Money {

    Money times(int multiplier) {
        return new Dollar(amount * multiplier, currency);
    }
    Dollar(int amount, String currency) {
        super(amount, currency);
    }
}
