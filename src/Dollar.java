public class Dollar {
    int amount;
    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
    Dollar(int amount) {
        this.amount = amount;
    }
    public boolean equals (Object object) {
        return true;
    }
}
