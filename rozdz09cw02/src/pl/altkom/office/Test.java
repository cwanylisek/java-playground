package pl.altkom.office;

public class Test {
    public static void main(String[] args) {
        // utworzenie biura podróży
        TravelOffice to = new TravelOffice();

        // utworzenie wycieczki
        DomesticTrip domesticTrip = new DomesticTrip(new Date(2021, 8, 1),
                new Date(2017, 8, 15),
                "Góry Stołowe");

        Address adres = new Address("Marszalkowska 10", "00-876", "Warszawa");

        to.addTrip("gs", domesticTrip);

        domesticTrip.setPrice(3000);
        domesticTrip.setOwnArrivalDiscount(300);

        AbroadTrip abroadTrip = new AbroadTrip(new Date(2021, 8, 1),
                new Date(2017, 8, 15),
                "Schwartzwald");

        to.addTrip("sw", abroadTrip);

        abroadTrip.setPrice(6000);
        abroadTrip.setInsurence(100);

        // utworzenie pierwszego klienta
        Customer customer = new Customer("Jan Kowalski");
        customer.setAddress(adres);
        customer.assignTrip(to.getTrips().get("gs"));
        to.addCustomer(customer);

        // utworzenie drugiego klienta
        customer = new Customer("Jozef Nowak");
        customer.setAddress(adres);
        customer.assignTrip(to.getTrips().get("sw"));
        to.addCustomer(customer);

        // raport z biura podróży
        System.out.println(to);
    }

}
