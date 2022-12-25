package Transport;

public class Truck<T extends DriverC> extends Transport implements Competing {
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
}
