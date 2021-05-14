package pl.altkom.isLeapYear;

import java.util.Date;

public class LeapYear {
    public static boolean LeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        return year % 4 == 0;


    }

    public static void main(String[] args) {
        System.out.println(LeapYear(2021));
        System.out.println(LeapYear(2008));
    }
}