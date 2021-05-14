package pl.altkom.office;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// klasa reprezentująca biuro podróży
public class TravelOffice {
    private Set<Customer> customers = new HashSet<>();
    private Map<String, Trip> trips = new HashMap<>();

    public Map<String, Trip> getTrips() {
        return trips;
    }

    // metoda dodająca kolejnego klienta do biura podróży
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addTrip(String id, Trip trip) {
        trips.put(id, trip);
    }

    public boolean removeTrip(String id) {
        if (id != null) {
            return trips.remove(id) != null;
        }
        return false;
    }

    public Customer findCustomerByName(String name) {
        for (Customer customer : customers) {
            if (customer.toString().startsWith("Name: " + name + "\n")) {
                return customer;
            }
        }
        return null;
    }

    public boolean removeCustomer(Customer customer) {
        if (customer != null) {
            return customers.remove(customer);
        }
        return false;
    }

    // metoda zwracająca bieżącą liczbę klientów
    public int getCustomerCount() {
        return customers.size();
    }

    // metoda informacyjna zwracająca opis biura podróży (informacje o wszystkich klientach)
    public String toString() {
        String report = "";
        for (Customer customer : customers) {
            report += customer + "\n";
        }
        return report;
    }

}
