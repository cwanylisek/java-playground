package pl.altkom.to;

// klasa reprezentująca biuro podróży
public class TravelOffice {
	int customerCount = 0;                  // bieżąca liczba klientów
	Customer[] customers = new Customer[2]; // tablica klientów

	// metoda dodająca kolejnego klienta do biura podróży
	public void addCustomer(Customer customer) {
		if (customerCount == customers.length) {
			Customer[] temp = new Customer[customers.length + 2];
			System.arraycopy(customers, 0, temp, 0, customers.length);
			customers = temp;
		}
		// dodanie klienta i aktualizacja ilości klientów
		customers[customerCount++] = customer;
	}

	// metoda zwracająca bieżącą liczbę klientów
	public int getCustomerCount() {
		return customerCount;
	}

	// metoda informacyjna zwracająca opis biura podróży (informacje o wszystkich klientach)
	public String toString() {
		String report = "";
		for (int i = 0; i < customerCount; i++) {
			report += customers[i].toString() + "\n\n";
		}
		return report;
	}

}
