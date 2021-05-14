package pl.altkom.to;

public class DomesticTrip extends Trip{
    private int ownArrivalDiscount;

    public DomesticTrip(Date start, Date end, String destination) {
        super(start, end, destination);
    }

    public void setOwnArrivalDiscount(int ownArrivalDiscount) {
        this.ownArrivalDiscount = ownArrivalDiscount;
    }

    @Override
    public int getPrice() {
        return super.getPrice() - ownArrivalDiscount;
    }
}
