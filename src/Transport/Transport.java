package Transport;

import java.util.List;
import java.util.Objects;

public abstract class Transport<T extends Driver> implements Competing {
    private String brand;
    private String model;
    private double engineVolume;


    public Transport(String brand, String model, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
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
//    public void getDiagnosisTransport()  {
//        System.out.println ("Проводим диагностику грузовика " + getBrand () + " " + getModel ());
//    }
//        public void addMechanicTeamRacing(List<Mechanic> mechanics) {
//            System.out.println ("Грузовик " + getBrand() + " " + getModel() + ", объем двигателя " + getEngineVolume());
//            for (Mechanic value : mechanics)
//            { if (value.getVehicleRepairSpecification () == VehicleRepairSpecification.SPECIFICATION_TRUCK||value.getVehicleRepairSpecification () == VehicleRepairSpecification.SPECIFICATION_UNIVERSAL)
//            {System.out.println ( "- обслуживает " + value);}
//            }
//        }
//    public void doRegularService(List<Mechanic> mechanics) {
//        System.out.println ("Механики :");
//        for (Mechanic value : mechanics)
//        { if (value.getVehicleRepairSpecification () == VehicleRepairSpecification.SPECIFICATION_CAR||value.getVehicleRepairSpecification () == VehicleRepairSpecification.SPECIFICATION_UNIVERSAL)
//        {System.out.println ( "- " + value);}
//        }
//        System.out.println ("производят регулярное ТО на автомобиле " + getBrand ()+" "+getModel ());
//
//    }
}
