package Transport;
import java.util.List;
import Transport.Mechanic;
import Transport.VehicleRepairSpecification;

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
        System.out.println ( "Проводим диагностику автомобиля " + getBrand () + " " + getModel () );
    }
    public void addMechanicTeamRacing(List<Mechanic> mechanics) {
        System.out.println ("Автомобиль " + getBrand () + " " + getModel () + ", объем двигателя " + getEngineVolume ());
        for (Mechanic value : mechanics)
        { if (value.getVehicleRepairSpecification () == VehicleRepairSpecification.SPECIFICATION_CAR||value.getVehicleRepairSpecification () == VehicleRepairSpecification.SPECIFICATION_UNIVERSAL)
        {System.out.println ( "- обслуживает " + value);}
        }
    }
    public void doRegularService(List<Mechanic> mechanics) {
        System.out.println ("Механики :");
        for (Mechanic value : mechanics)
        { if (value.getVehicleRepairSpecification () == VehicleRepairSpecification.SPECIFICATION_CAR||value.getVehicleRepairSpecification () == VehicleRepairSpecification.SPECIFICATION_UNIVERSAL)
        {System.out.println ( "- " + value);}
        }
        System.out.println ("производят регулярное ТО на автомобиле " + getBrand ()+" "+getModel ());

    }


}





