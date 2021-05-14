package pl.altkom.to;

//klasa reprezentująca klienta
public class Customer {
    // atrybuty
    private String name;     // imię i nazwisko
    private Address address; // adres (referencja do obiektu adresu)
    private Trip trip;       // wycieczka (referencja do obiektu wycieczki)

    // poprzez ten konstruktor podajemy tylko imię i nazwisko klienta
    public Customer(String name) {
        this.name = name;
    }

    // metoda umożliwiająca podanie referencji do adresu
    public void setAddress(Address address) {
        this.address = address;
    }

    // metoda umożliwiająca podanie referencji do wycieczki
    public void assignTrip(Trip trip) {
        this.trip = trip;
    }

    // metoda informacyjna zwracająca opis klienta
    @Override
    public String toString() {
        return String.format("Name: %s%nAddress: %s%nHas the following trip: %s",
                name, address.toString(), trip.toString());
    }
}
