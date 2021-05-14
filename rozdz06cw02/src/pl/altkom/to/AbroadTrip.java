package pl.altkom.to;

public class AbroadTrip extends Trip {
    private int insurence;

    public AbroadTrip(Date start, Date end, String destination) {
        super(start, end, destination);
    }

    public void setInsurence(int insurence) {
        this.insurence = insurence;
    }

    @Override
    public int getPrice() {
        return super.getPrice() + insurence;
    }
}
