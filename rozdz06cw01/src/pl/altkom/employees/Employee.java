package pl.altkom.employees;

// klasa reprezentująca pracownika
public class Employee {

    // atrybuty
    private String name;         // imię
    private int salary = 10_000; // zarobki
    private String info;         // opis

    // konstruktor inicjujący dane pracownika
    public Employee(String name) {
        this.name = name;
        this.info = getInfo();
    }

    // metoda zwracająca opis (dane) pracownika
    public String getInfo() {
        return String.format("%s, salary: %d", name, salary);
    }

    // metoda dostępowa zwracająca pole opisu pracownika (inicjowane w konstruktorze)
    public String getEmployeeInfo() {
        return info;
    }
}
