package Transport;

public class Bus<B extends DriverD> extends Transport implements Competing {
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

}
