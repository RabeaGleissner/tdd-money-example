public class Dollar extends Money {

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }
    Dollar(int amount, String currency) {
        super(amount, currency);
    }
}
