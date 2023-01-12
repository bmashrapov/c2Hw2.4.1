package Transport;

import java.util.List;

public class Truck extends Transport implements Competing {
    private CargoCapacity cargoCapacity;

    public CargoCapacity getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(CargoCapacity cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public Truck(String brand, String model, double engineVolume, CargoCapacity cargoCapacity) {
        super(brand, model, engineVolume);
        this.cargoCapacity = cargoCapacity;

    }


    @Override
    public void printType() {
        if (getCargoCapacity().getLowerBound() == null && getCargoCapacity().getUpperBound() == null) {
            System.out.println("Грузоподъемность: неограниченная");
        } else if (getCargoCapacity().getLowerBound() == null) {
            System.out.println("Грузоподъемность: до " + cargoCapacity.getUpperBound() + " тонн");
        } else if (getCargoCapacity().getUpperBound() == null) {
            System.out.println("Грузоподъемность: от" + getCargoCapacity().getLowerBound() + " тонн");
        } else {
            System.out.println("Грузоподъемность: от  " + getCargoCapacity().getLowerBound()+" тонн, до " + cargoCapacity.getUpperBound()+" тонн");
        }
    }

    @Override
    public boolean service() {
        return Math.random()>0.75;
    }
    public void getDiagnosisTransport()  {
        System.out.println ("Проводим диагностику грузовика " + getBrand () + " " + getModel ());
    }
    public void addMechanicTeamRacing(List<Mechanic> mechanics) {
        System.out.println ("Грузовик " + getBrand() + " " + getModel() + ", объем двигателя " + getEngineVolume());
        for (Mechanic value : mechanics)
        { if (value.getVehicleRepairSpecification () == VehicleRepairSpecification.SPECIFICATION_TRUCK||value.getVehicleRepairSpecification () == VehicleRepairSpecification.SPECIFICATION_UNIVERSAL)
        {System.out.println ( "- обслуживает " + value);}
        }
    }
    public void doRegularService(List<Mechanic> mechanics) {
        System.out.println ("Механики :");
        for (Mechanic value : mechanics)
        { if (value.getVehicleRepairSpecification () == VehicleRepairSpecification.SPECIFICATION_TRUCK||value.getVehicleRepairSpecification () == VehicleRepairSpecification.SPECIFICATION_UNIVERSAL)
        {System.out.println ( "- " + value);}
        }
        System.out.println ("производят регулярное ТО на автомобиле " + getBrand ()+" "+getModel ());

    }


}


