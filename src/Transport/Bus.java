package Transport;

import java.util.List;

public class Bus extends Transport implements Competing {
    private BusCapacity busCapacity;

    public BusCapacity getBusCapacity() {
        return busCapacity;
    }

    public void setBusCapacity(BusCapacity busCapacity) {
        this.busCapacity = busCapacity;
    }

    public Bus(String brand, String model, double engineVolume, BusCapacity busCapacity) {
        super(brand, model, engineVolume);
        this.busCapacity = busCapacity;

    }


    @Override
    public void printType() {
        if (getBusCapacity().getLower() == 0 && getBusCapacity().getUpper() != 0) {
            System.out.println("Вместимость: до " + getBusCapacity().getUpper() + " мест");
        } else if (getBusCapacity().getLower() != 0 && getBusCapacity().getUpper() == 0) {
            System.out.println("Вместимость: от " + getBusCapacity().getLower() + " мест");
        } else if (getBusCapacity().getLower() != 0 && getBusCapacity().getUpper() != 0) {
            System.out.println("Вместимость: " + getBusCapacity().getLower() + " - " + getBusCapacity().getUpper() + " мест");
        }
    }

    @Override
    public boolean service() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " в диагностике не нуждается");
        return true;
    }

    public void getDiagnosisTransport() {
        System.out.println("Автобусы не проходят диагностику");
    }

    public void addMechanicTeamRacing(List<Mechanic> mechanics) {
        System.out.println("Автобус " + getBrand() + " " + getModel() + ", объем двигателя " + getEngineVolume());
        for (Mechanic value : mechanics) {
            if (value.getVehicleRepairSpecification() == VehicleRepairSpecification.SPECIFICATION_BUS || value.getVehicleRepairSpecification() == VehicleRepairSpecification.SPECIFICATION_UNIVERSAL) {
                System.out.println("- обслуживает " + value);
            }
        }
    }

    public void doRegularService(List<Mechanic> mechanics) {
        System.out.println("Механики :");
        for (Mechanic value : mechanics) {
            if (value.getVehicleRepairSpecification() == VehicleRepairSpecification.SPECIFICATION_BUS || value.getVehicleRepairSpecification() == VehicleRepairSpecification.SPECIFICATION_UNIVERSAL) {
                System.out.println("- " + value);
            }
        }
        System.out.println("производят регулярное ТО на автомобиле " + getBrand() + " " + getModel());
    }
}
