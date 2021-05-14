package pl.altkom.lambdy;

public class Test {
    public static void main(String[] args) {
        int a = 7;
        int b = 3;

        Add d = new Add();
        Substract o = new Substract();

        System.out.println(d.add(a, b));
        System.out.println(o.substract(a, b));
    }
}
