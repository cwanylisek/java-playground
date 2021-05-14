package pl.altkom.vehicles;

public abstract class Vehicle { // klasa abstrakcyjna słuzy do zdefiniowania metod dla rzeczywistych klas
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public abstract double getDistance();

    public abstract double getFuelNeeds();

    public double calculateFuelConsumption() {
        return getFuelNeeds() / getDistance() * 100;
    }

    /*
    jak dotrzec do obiektu class
    Class c = String.class;     //1
    Class c = ref.getClass();   //2
    Class c = Class.forName("java.lang.String"); //3
     */

    public void go() {
        System.out.println(getClass().getName() + ": " + this + " started");
    }

    public void stop() {
        System.out.println(getClass().getSimpleName() + ": " + this + " stopped");
    }
}
