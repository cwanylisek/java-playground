package pl.altkom.travelOffice;

public class Address {
    String street;
    String zipCode;
    String city;

    public Address(String street, String zipCode, String city) {
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
    }

    public String getInfo() {
        return String.format("%s, %s, %s", street, zipCode, city);
    }
}
