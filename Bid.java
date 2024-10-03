public class Bid {
    private Person bidder;
    private long value;

    public Bid(Person bidder, long value) {
        this.bidder = bidder;
        this.value = value;
    }

    public Person getBidder() {
        return bidder;
    }

    public long getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Bidder: " + bidder.getName() + ", Value: " + value;
    }
}
