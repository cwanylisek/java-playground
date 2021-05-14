package pl.altkom.office;

// interfejs definiujący metody do interakcji z użytkownikiem
public interface UserInterface {

    Customer addCustomer();

    Trip addTrip();

    void assign();

    boolean removeCustomer();

    boolean removeTrip();

    void showTrips();

    void showCustomers();
}
