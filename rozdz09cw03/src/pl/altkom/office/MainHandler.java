package pl.altkom.office;

import pl.altkom.office.Date;

import java.util.Map;
import java.util.Scanner;

public class MainHandler implements UserInterface {
    private TravelOffice to;
    private final Scanner sc;
    public MainHandler(TravelOffice to) {
        this.to = to;
        sc = new Scanner(System.in);
        sc.useDelimiter("\r\n");
    }

    @Override
    public Customer addCustomer() {
        System.out.println("First name? ");
        String firstName = sc.next();
        System.out.println("Last name? ");
        String lastName = sc.next();
        Customer customer = new Customer(firstName + " " + lastName);
        System.out.println("Street? ");
        String street = sc.next();
        System.out.println("Zip code? ");
        String zipCode = sc.next();
        System.out.println("City? ");
        String city = sc.next();
        Address address = new Address(street, zipCode, city);
        customer.setAddress(address);
        System.out.println("Created!");
        return null;
    }

    @Override
    public Trip addTrip() {
        System.out.println("Trip id? ");
        String id = sc.next();
        System.out.println("Destination? ");
        String destination = sc.next();
        System.out.println("Start date? ");
        String start = sc.next();
        Date startDate = Date.of(start, "-");
        String end = sc.next();
        Date endDate = Date.of(end, "-");
        System.out.println("Price? ");
        int price = sc.nextInt();
        System.out.println("Trip type? (a/l)?");
        String type = sc.next();
        Trip trip;
        if("a".equals(type)) {
            System.out.println("Insurance? ");
            int insurance = sc.nextInt();
            trip = new AbroadTrip(startDate, endDate, destination);
            trip.setPrice(price);
            ((AbroadTrip)trip).setInsurence(insurance);
        } else {
            System.out.println("Discount? ");
            int discount = sc.nextInt();
            trip = new DomesticTrip(startDate, endDate, destination);
            ((DomesticTrip)trip).setOwnArrivalDiscount(discount);
        }
        trip.setPrice(price);
        to.addTrip(id, trip);
        System.out.println("System accepted trip");
        return trip;
    }

    @Override
    public void assign() {

    }

    @Override
    public boolean removeCustomer() {
        return false;
    }

    @Override
    public boolean removeTrip() {
        return false;
    }

    @Override
    public void showTrips() {
        for (Map.Entry<String, Trip> entry: to.getTrips().entrySet()) {
            System.out.println(entry.getKey()+": "+entry.getValue() + "\n");
        }
    }

    @Override
    public void showCustomers() {
        to.getCustomers();
    }
}
