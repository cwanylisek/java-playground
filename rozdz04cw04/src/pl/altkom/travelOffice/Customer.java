package pl.altkom.travelOffice;

public class Customer {
    String name;
    Address adress;
    Trip trip;

    public Customer(String name) {
        this.name = name;
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }

    public void assignTrip(Trip trip) {
        this.trip = trip;
    }

    public String getInfo() {
        return String.format("Name: %s Adress: %s, Trip: %s", name, adress, trip);
    }
}
