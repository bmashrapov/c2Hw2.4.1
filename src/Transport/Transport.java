package Transport;

import java.util.Objects;

public abstract class Transport implements Competing {
    private String brand;
    private String model;
    private double engineVolume;
    private String type;



    public Transport(String brand, String model, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }

    public Transport() {
        this.type=getType();
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract void printType();

    public void startMoving() {
        System.out.println(brand + " " + model + " начинает движение");
    }

    public void finishTheMove() {
        System.out.println(brand + " " + model + " заканчивает движение");
    }

    @Override
    public void pitStop(double time) {

    }

    @Override
    public void bestLapTime(double time) {

    }

    @Override
    public void maximumSpeed(double speed) {
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && brand.equals(transport.brand) && model.equals(transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }
}
