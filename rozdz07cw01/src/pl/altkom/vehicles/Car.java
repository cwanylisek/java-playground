package pl.altkom.vehicles;

public class Car extends Vehicle{

    public Car(String name) {
        super(name);
    }

    @Override
    public double getDistance() {
        return 50;
    }

    @Override
    public double getFuelNeeds() {
        return 5;
    }
}
