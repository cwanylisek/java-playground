package pl.altkom.vehicles;

public class Ship extends Vehicle implements Sailing {

    public Ship(String name) {
        super(name);
    }

    @Override
    public void dock() {
        System.out.println(this + " docked");
    }

    @Override
    public double getDistance() {
        return 500;
    }

    @Override
    public double getFuelNeeds() {
        return 1000;
    }

    @Override
    public void stop() {

    }
}
