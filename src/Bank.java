public class Bank {
    Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    public void addRate(String chf, String usd, int i) {
    }
    int rate(String from, String to) {
        return (from.equals("CHF") && to.equals("USD"))
                ? 2
                : 1;
    }

    private Hashtable rates= new Hashtable();

    void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to)), new Integer(rate));
    }
}
