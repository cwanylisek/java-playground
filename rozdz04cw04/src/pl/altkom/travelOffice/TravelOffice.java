package pl.altkom.travelOffice;

import date.Date;

public class TravelOffice {
    Customer[] customers = new Customer[2];
    int customerCount;

    public void addCustomer(Customer customer) {
        customers[customerCount] = customer;
    }

    public int getCustomerCount() {
        return customerCount;
    }

    public String getInfo() {
        String report = "";
        for (Customer customer : customers) { //foreach loop
            report += customer.getInfo() + "\n";

        }
        return report;
    }

    public static void main(String[] args) {
        Date leaveDate = new Date(2021, 7, 8);
        Date backDate = new Date(2021, 7, 21);
        Trip travel = new Trip(leaveDate, backDate, "Góry");

        Address address = new Address("ul. Morska 12", "12-345", "Gdynia");

        Customer client = new Customer("Jan Kowalski");
        client.setAdress(address);
        client.assignTrip(travel);

        System.out.println((client.getInfo()));
    }
}