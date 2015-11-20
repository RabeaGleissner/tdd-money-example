public class Dollar extends Money {
    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
    Dollar(int amount) {
        this.amount = amount;
    }
    public boolean equals (Object object) {
        Money dollar= (Money) object;
        return amount == dollar.amount;
    }
}
