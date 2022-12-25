package Transport;

public class DriverD<T extends Transport & Competing> extends Driver {
    public DriverD(String fullName, boolean typeOfLicence, int experience) {
        super(fullName, typeOfLicence, experience);
    }

    public DriverD() {
        super("", true, 0);
    }

    public void drive(T transport) {
        System.out.println("Водитель: " + getFullName() + " управляет автомобилем: " + transport.getBrand() + " " + transport.getModel() + " и будет учавствовать в заезде");
    }
}
