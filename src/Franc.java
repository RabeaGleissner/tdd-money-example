public class Franc extends Money {
    Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }
    Franc (int amount) {
        this.amount = amount;
    }
    public boolean equals (Object object) {
        Money money= (Money) object;
        return amount == money.amount;
    }
}
