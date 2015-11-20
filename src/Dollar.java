public class Dollar extends Money {
    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
    Dollar(int amount) {
        this.amount = amount;
    }
    public boolean equals (Object object) {
        Dollar dollar= (Dollar) object;
        return amount == dollar.amount;
    }
}
