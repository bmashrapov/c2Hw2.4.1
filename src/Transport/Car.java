package Transport;

import java.util.ArrayList;
import java.util.List;

public class Car extends Transport implements Competing {
    private TypeOfBody typeOfBody;

    public TypeOfBody getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    public Car(String brand, String model, double engineVolume, TypeOfBody typeOfBody) {
        super(brand, model, engineVolume);
        this.typeOfBody = typeOfBody;

    }

    public Car(String brand, String model, double engineVolume, TypeOfBody typeOfBody, List<Mechanic> mechanic, List<Transport> transports) {
        super(brand, model, engineVolume);
        this.typeOfBody = typeOfBody;

    }

    @Override
    public void printType() {
        if (typeOfBody == null) {
            System.out.println("Data error");
        } else {
            System.out.println(typeOfBody);
        }
    }

    @Override
    public boolean service() {
        return Math.random() > 0.7;
    }


    public void getDiagnosisTransport() {
        System.out.println("Проводим диагностику автомобиля " + getBrand() + " " + getModel());
    }

    public void addMechanicTeamRacing(Mechanic... mechanics) {
        List<Mechanic> mechanic = new ArrayList<>();
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + ", объем двигателя " + getEngineVolume());
        for (Mechanic value : mechanic) {
            if (value.getVehicleRepairSpecification() == VehicleRepairSpecification.SPECIFICATION_CAR || value.getVehicleRepairSpecification() == VehicleRepairSpecification.SPECIFICATION_UNIVERSAL) {
                System.out.println("- обслуживает " + value);
            }
        }
    }

    public void doRegularService(Mechanic... mechanic) {
        System.out.println("Механики :");
        for (Mechanic value : mechanic) {
            if (value.getVehicleRepairSpecification() == VehicleRepairSpecification.SPECIFICATION_CAR || value.getVehicleRepairSpecification() == VehicleRepairSpecification.SPECIFICATION_UNIVERSAL) {
                System.out.println("- " + value);
            }
        }
        System.out.println("производят регулярное ТО на автомобиле " + getBrand() + " " + getModel());

    }


}





