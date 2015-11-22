public class Franc extends Money {

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }
    Franc (int amount, String currency) {
        super(amount, currency);
    }
}
