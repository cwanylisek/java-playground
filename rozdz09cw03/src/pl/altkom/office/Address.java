package pl.altkom.office;

public class Address {
	// atrybuty adresu
	private String street; // ulica
	private String zip;    // kod pocztowy
	private String city;   // miejscowość

	// konstruktor umożliwiający zainicjowanie wszystkich atrybutów klasy
	public Address(String street, String zip, String city) {
		this.street = street;
		this.zip = zip;
		this.city = city;
	}

	// metoda zwracająca opis (dane) adresu
	@Override
	public String toString() {
		return String.format("%s, %s %s", street, zip, city);
	}
}
