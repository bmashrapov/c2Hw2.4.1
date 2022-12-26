package Transport;

public class Car<C extends DriverB> extends Transport implements Competing {
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
}





