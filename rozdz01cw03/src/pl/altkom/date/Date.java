package pl.altkom.date;

import java.lang.reflect.Constructor;

public class Date {
    int year;
    int month;
    int day;

    public Date(int y, int m, int d) {
        year = y;
        month = m;
        day = d;
    }

    public String getInfo() {
        return String.format("%4d-%02d-%02d", year, month, day);
    }
}
