import Transport.*;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7, TypeOfBody.COUPE);
        Car audi = new Car("Audi", "А8 50 L TDI", 3.0, TypeOfBody.CROSSOVER);
        Car bmw = new Car("BMW", "Z8", 3.0, TypeOfBody.PICKUP);
        Car kia = new Car("Kia", "Sportage", 2.0, TypeOfBody.MINIVAN);
        Truck volvo = new Truck("Volvo", "V12", 6.2, CargoCapacity.N1);
        Truck man = new Truck("MAN", "M12", 6.6, CargoCapacity.N2);
        Truck kamaz = new Truck("Kamaz", "K12", 6.8, CargoCapacity.N3);
        Truck renault = new Truck("Renault", "R12", 6.0, CargoCapacity.N3);
        Bus solaris = new Bus("Solaris", "A123", 5.0, BusCapacity.SMALL);
        Bus mercedes = new Bus("Mercedes", "M123", 5.2, BusCapacity.MEDIUM);
        Bus paz = new Bus("PAZ", "P123", 5.4, BusCapacity.MEDIUM);
        Bus liaz = new Bus("LIAZ", "L123", 5.6, BusCapacity.VERY_SMALL);
        DriverD<Bus> ilja = new DriverD("Артем Федосеев", true, 6);
        ilja.drive(solaris);
        DriverB<Car> andrej = new DriverB("Андрей Малиновский", true, 4);
        andrej.drive(audi);
        DriverC<Truck> sergej = new DriverC("Сергей Семенов", true, 5);
        sergej.drive(volvo);
        volvo.printType();
        audi.printType();
        solaris.printType();

    }
}