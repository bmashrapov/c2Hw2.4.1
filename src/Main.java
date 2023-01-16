import Transport.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        service(lada, audi, bmw, kia,
                volvo, man, kamaz, renault,
                solaris, mercedes, paz, liaz);
        List<Transport> racerTransport = new ArrayList<>();
        racerTransport.add(lada);
        racerTransport.add(audi);
        racerTransport.add(bmw);
        racerTransport.add(kia);
        racerTransport.add(volvo);
        racerTransport.add(man);
        racerTransport.add(kamaz);
        racerTransport.add(renault);
        racerTransport.add(solaris);
        racerTransport.add(mercedes);
        racerTransport.add(paz);
        racerTransport.add(liaz);
        Mechanic mechanic1 = new Mechanic("Dmitri L", "CarService1", VehicleRepairSpecification.SPECIFICATION_TRUCK);
        Mechanic mechanic2 = new Mechanic("Piter D", "CarService4", VehicleRepairSpecification.SPECIFICATION_TRUCK);
        Mechanic mechanic3 = new Mechanic("Aleks K", "CarService1", VehicleRepairSpecification.SPECIFICATION_BUS);
        Mechanic mechanic4 = new Mechanic("Maria B", "CarService2", VehicleRepairSpecification.SPECIFICATION_UNIVERSAL);
        Mechanic mechanic5 = new Mechanic("Aneta G", "CarService3", VehicleRepairSpecification.SPECIFICATION_CAR);
//        List<Mechanic> mechanics = new ArrayList<>();
//        mechanics.add(mechanic1);
//        mechanics.add(mechanic2);
//        mechanics.add(mechanic3);
//        mechanics.add(mechanic4);
//        mechanics.add(mechanic5);
        List<Driver> driverList = new ArrayList<>();
        driverList.add(ilja);
        driverList.add(andrej);
        driverList.add(sergej);
        kia.addMechanicTeamRacing(mechanic5, mechanic4);
        solaris.addMechanicTeamRacing(mechanic3, mechanic4);
        volvo.addMechanicTeamRacing(mechanic1, mechanic2);
        bmw.doRegularService(mechanic5, mechanic4);
        mercedes.doRegularService(mechanic3, mechanic4);
        man.doRegularService(mechanic1, mechanic2);
        // ----------------------MAP----------------------
        Map<String, String> mechanicMap = new HashMap<>();
        mechanicMap.put(audi.getBrand(), mechanic5.getFullName());
        mechanicMap.put(kia.getBrand(), mechanic4.getFullName());
        mechanicMap.put(lada.getBrand(), mechanic4.getFullName());
        mechanicMap.put(bmw.getBrand(), mechanic5.getFullName());
        mechanicMap.put(bmw.getBrand(), mechanic5.getFullName());
        mechanicMap.put(volvo.getBrand(), mechanic1.getFullName());
        mechanicMap.put(man.getBrand(), mechanic2.getFullName());
        mechanicMap.put(kamaz.getBrand(), mechanic1.getFullName());
        mechanicMap.put(renault.getBrand(), mechanic2.getFullName());
        mechanicMap.put(solaris.getBrand(), mechanic3.getFullName());
        mechanicMap.put(mercedes.getBrand(), mechanic4.getFullName());
        mechanicMap.put(paz.getBrand(), mechanic3.getFullName());
        mechanicMap.put(liaz.getBrand(), mechanic4.getFullName());
        for (Map.Entry<String, String> mechanic : mechanicMap.entrySet()) {
            System.out.println("Ключ: " + mechanic.getKey() + ". Значение: " + mechanic.getValue());
        }
    }

    private static void service(Transport... transports) {
        for (Transport transport : transports) {
            serviceTransport(transport);
        }
    }

    private static void serviceTransport(Transport transport) {
        if (!transport.service()) {
            try {
                throw new RuntimeException("Автомобиль " + transport.getBrand() + " " + transport.getModel() + " не прошёл диагностику");
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
