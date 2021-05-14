package pl.altkom.office;

import java.util.Map;
import java.util.Scanner;

public class MainHandler implements UserInterface {
    private TravelOffice to;
    private Scanner sc;

    public MainHandler(TravelOffice to) {
        this.to = to;
        sc = new Scanner(System.in);
        sc.useDelimiter("\n");
    }

    @Override
    public Customer addCustomer() {
        System.out.print("First name? ");
        String firstName = sc.next();
        System.out.print("Last name? ");
        String lastName = sc.next();
        Customer customer = new Customer(firstName + " " + lastName);
        System.out.print("Street? ");
        String street = sc.next();
        System.out.print("Zip code? ");
        String zipCode = sc.next();
        System.out.print("City? ");
        String city = sc.next();
        Address address = new Address(street, zipCode, city);
        customer.setAddress(address);
        to.addCustomer(customer);
        System.out.println("System accepted new customer...");
        return customer;
    }

    @Override
    public Trip addTrip() {
        System.out.print("Trip id? ");
        String id = sc.next();
        System.out.print("Destination? ");
        String destination = sc.next();
        System.out.print("Start date (yyyy-mm-dd)? ");
        String start = sc.next();
        Date startDate = Date.of(start, "-");
        System.out.print("End date (yyyy-mm-dd)? ");
        String end = sc.next();
        Date endDate = Date.of(end, "-");
        System.out.print("Price? ");
        int price = sc.nextInt();
        System.out.print("Trip type (a/l)? ");
        String type = sc.next();
        Trip trip;
        if ("a".equals(type)) {
            System.out.print("Insurance? ");
            int insurance = sc.nextInt();
            trip = new AbroadTrip(startDate, endDate, destination);
            ((AbroadTrip) trip).setInsurance(insurance);
        } else {
            System.out.print("Discount? ");
            int discount = sc.nextInt();
            trip = new DomesticTrip(startDate, endDate, destination);
            ((DomesticTrip) trip).setOwnArrivalDiscount(discount);
        }
        trip.setPrice(price);
        to.addTrip(id, trip);
        System.out.println("System accepted new trip...");
        return trip;
    }

    @Override
    public void assign() {
        System.out.print("Customer name? ");
        String name = sc.next();

        Customer customer = to.findCustomerByName(name);
        if (customer == null) {
            System.out.println("No customer with name '" + name + "'\n");
            return;
        }

        System.out.print("Trip id? ");
        String id = sc.next();

        Trip trip = to.getTrips().get(id);
        if (trip == null) {
            System.out.println("No trip under id '" + id + "'\n");
            return;
        }
        customer.assignTrip(trip);
    }

    @Override
    public boolean removeCustomer() {
        System.out.print("Customer name? ");
        String customerName = sc.next();

//        Customer c = to.findCustomerByName(customerName);
//        if (c == null) {
//            System.out.println("No such customer has been found\n");
//            return false;
//        }
//        to.removeCustomer(c);
        to.getCustomers().removeIf(c -> c.toString().startsWith("Name: " + customerName + "\n"));

        System.out.println("Customer has been removed...\n");
        return true;
    }

    @Override
    public boolean removeTrip() {
        System.out.print("Enter trip id: ");
        String id = sc.next();
        boolean success = to.removeTrip(id);
        if (!success) {
            System.out.println("No such trip has been found\n");
            return false;
        }
        System.out.println("Trip has been removed...\n");
        return true;
    }

    @Override
    public void showTrips() {
        for (Map.Entry<String, Trip> entry : to.getTrips().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + "\n");
        }
    }

    @Override
    public void showCustomers() {
//        for (Customer customer : to.getCustomers()) {
//            System.out.println(customer + "\n");
//        }
        // to.getCustomers().forEach(c -> System.out.println(c + "\n")); // to na dole jest rowne tej linii
        to.getCustomers().forEach(System.out::println);
    }
}
