import Transport.*;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7);
        Car audi = new Car("Audi", "А8 50 L TDI", 3.0);
        Car bmw = new Car("BMW", "Z8", 3.0);
        Car kia = new Car("Kia", "Sportage", 2.0);
        Truck volvo = new Truck("Volvo", "V12", 6.2);
        Truck man = new Truck("MAN", "M12", 6.6);
        Truck kamaz = new Truck("Kamaz", "K12", 6.8);
        Truck renault = new Truck("Renault", "R12", 6.0);
        Bus solaris = new Bus("Solaris", "A123", 5.0);
        Bus mercedes = new Bus("Mercedes", "M123", 5.2);
        Bus paz = new Bus("PAZ", "P123", 5.4);
        Bus liaz = new Bus("LIAZ", "L123", 5.6);
        DriverD<Bus> ilja = new DriverD("Артем Федосеев", true, 6);
        ilja.drive(solaris);
        DriverB<Car> andrej = new DriverB("Андрей Малиновский", true, 4);
        andrej.drive(audi);
        DriverC<Truck> sergej = new DriverC("Сергей Семенов", true, 5);
        sergej.drive(volvo);


    }
}