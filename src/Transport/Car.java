package Transport;

public class Car<C extends DriverB> extends Transport implements Competing {
    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }


}
