package Transport;

public class DriverC<T extends Transport & Competing> extends Driver {
    public DriverC(String fullName, boolean typeOfLicence, int experience) {
        super(fullName, typeOfLicence, experience);
    }

    public DriverC() {
        super("", true, 0);
    }
    public void drive(T transport) {
        System.out.println("Водитель: " + getFullName() + " управляет автомобилем: " + transport.getBrand() + " " + transport.getModel() + " и будет учавствовать в заезде");
    }
}
