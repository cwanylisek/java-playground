package pl.altkom.travelOffice;
import date.Date;

public class Trip {
    Date start;
    Date end;
    String destination;
    public Trip(Date start, Date end, String destination) {
        this.start = start;
        this.end = end;
        this.destination = destination;
    }

    public String getInfo() {
        return String.format("from %s to %s, %s", start.getInfo(), end.getInfo(), destination);
    }

}
