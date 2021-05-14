package pl.altkom.vehicles;

public class Test {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car("FSO Polonez"),
                new Truck("FSC Żuk"),
                new RaceCar("FSO Syrena Sport"),
                new Ship("ORP Dragon"),
                new Plane("PZinż Loś"),
        };

        for (Vehicle v: vehicles) {
            v.go();
            if(v instanceof Plane) {
                ((Plane) v).callAirControll();
            }
            v.stop();
            System.out.println("Efficency: " + v.calculateFuelConsumption() + "\n");
        }
    }
}
