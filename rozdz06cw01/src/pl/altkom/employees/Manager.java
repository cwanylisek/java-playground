package pl.altkom.employees;

// klasa menedżera (rozszerzenie klasy pracownika)
// menedżer też jest pracownikiem
public class Manager extends Employee {
	private String responsibility = "Java"; // odpowiedzialność (cecha wyróżniająca
	                                        // menedżera spośród pracowników)

	// poprzez konstruktor podajemy tylko imię menedżera
	public Manager(String name) {
		super(name); // wywołanie konstruktora nadklasy (pracownika)
	}

	// przedefiniowanie metody informacyjnej
	// uzupełnia informację o pracowniku o odpowiedzialność
	@Override
	public String getInfo() {
		return String.format("%s, responsibility: %s", super.getInfo(), responsibility);
	}
}
