package pl.altkom.phone;

public class CellPhone {
    private int limit;

    // starter
    public CellPhone(int limit) {
        this.limit = limit;
    }

    // account balance
    public int callMinutes() {
        return limit;
    }

    // recharge account
    public void recharge(int minutes) {
        limit += minutes;
    }

    // call
    public void call(int callTime) {
        limit -= callTime;
        System.out.println("Nice to talk with you...");
    }
}
