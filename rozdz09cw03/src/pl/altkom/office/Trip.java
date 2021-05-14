package pl.altkom.office;

import pl.altkom.office.Date;

//klasa reprezentująca wycieczkę
public class Trip {
    // atrybuty
    private Date start;         // data wyjazdu (referencja do obiektu daty)
    private Date end;           // data powrotu (referencja do obiektu daty)
    private String destination; // miejsce docelowe wycieczki
    private int price;

    // poprzez ten konstruktor inicjujemy wszystkie atrybuty klasy wycieczki
    public Trip(Date start, Date end, String destination) {
        this.start = start;
        this.end = end;
        this.destination = destination;
    }

    public Trip() {

    }

    // metoda informacyjna zwracająca pełny opis wycieczki


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s, from %s to %s, price %d", destination, start.toString(), end.toString(), getPrice());
    }
}
