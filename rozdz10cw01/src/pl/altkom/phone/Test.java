package pl.altkom.phone;

public class Test {
    public static void main(String[] args) {
        CellPhone phone = new CellPhone(10);
        for (int i = 0; i < 10; i++) {
            phone.call(4);
            System.out.println("Actual balance: " + phone.callMinutes());
            phone.recharge(7);
        }
    }
}
