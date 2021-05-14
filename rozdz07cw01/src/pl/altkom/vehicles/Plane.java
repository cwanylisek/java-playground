package pl.altkom.vehicles;

public class Plane extends Vehicle implements Flying {
    public Plane(String name) {
        super(name);
    }

    @Override
    public void takeOff() {
        System.out.println(this + " took off");
    }

    @Override
    public void land() {
        System.out.println(this + " landed");
    }

    @Override
    public void callAirControll() {
        System.out.println(this + " requested clearance for landing");
    }

    @Override
    public double getDistance() {
        return 1000;
    }

    @Override
    public double getFuelNeeds() {
        return 700;
    }

    @Override
    public void go() {
        super.go();
        takeOff();
    }

    @Override
    public void stop() {
        super.stop();
        land();
    }
}
