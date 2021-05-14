package pl.altkom.to;

public class Date {
	// atrybuty
	private int year;   // rok
	private int month;  // miesiąc
	private int day;    // dzień

	// konstruktor
	public Date(int y, int m, int d) {
		year = y;
		month = m;
		day = d;
	}

	// metoda konwertująca bieżącą datę na postać tekstową
	@Override
	public String toString() {
		// return year + "/" + month + "/" + day;
		return String.format("%4d/%02d/%02d", year, month, day);
	}

}
