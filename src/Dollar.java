public class Dollar extends Money {
    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
    Dollar(int amount) {
        this.amount = amount;
    }
    public boolean equals (Object object) {
        Money money= (Money) object;
        return amount == money.amount;
    }
}
