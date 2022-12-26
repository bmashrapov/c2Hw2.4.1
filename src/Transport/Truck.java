package Transport;

public class Truck<T extends DriverC> extends Transport implements Competing {
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
}


