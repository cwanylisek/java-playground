package date;

public class Test {
    public static void main(String[] args) {
        Date start = new Date(2019, 7, 23);
        Date end = new Date(2020, 5, 19);
        System.out.println(start);
        System.out.println(end);
        Date today;
        today = start;
        System.out.println(today.getInfo());
        today.year = 2021;
        today.day = 5;
        System.out.println(today.getInfo());
        System.out.println(start.getInfo());
    }
}
