package Transport;

import java.util.List;
import java.util.Objects;

public abstract class Transport<T extends Driver> implements Competing {
    private String brand;
    private String model;
    private double engineVolume;
    private List<Mechanic> mechanic;
    private List<Driver> drivers;

    public List<Mechanic> getMechanic() {
        return mechanic;
    }

    public void setMechanic(List<Mechanic> mechanic) {
        this.mechanic = mechanic;
    }

    public List<Driver> getTransports() {
        return drivers;
    }

    public void setTransports(List<Driver> transports) {
        this.drivers = drivers;
    }

    public Transport(String brand, String model, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.mechanic = mechanic;
        this.drivers = drivers;
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
    public abstract void printType();

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
    public void drive(Driver driver){
        System.out.println("Водитель: " + driver.getFullName() + " управляет автомобилем: " + getBrand() + " " + getModel() + " и будет учавствовать в заезде");
    }

    public abstract boolean service();
//    public abstract void addMechanicTeamRacing(List<Mechanic> mechanics);

}
