public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private boolean isManual;

    public Car(String name, String size, int wheels, int doors, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.isManual = isManual;
    }

}
