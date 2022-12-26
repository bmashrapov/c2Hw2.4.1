package Transport;

public class Bus <B extends DriverD> extends Transport  {
    private BusCapacity busCapacity;

    public BusCapacity getBusCapacity() {
        return busCapacity;
    }

    public void setBusCapacity(BusCapacity busCapacity) {
        this.busCapacity = busCapacity;
    }

    public Bus(String brand, String model, double engineVolume, BusCapacity busCapacity) {
        super(brand, model, engineVolume);
        this.busCapacity=busCapacity;

    }


    @Override
    public void printType() {
        if (getBusCapacity().getLower() == 0 && getBusCapacity().getUpper() != 0) {
            System.out.println("Вместимость: до " + getBusCapacity().getUpper() + " мест");
        } else if (getBusCapacity().getLower() != 0 && getBusCapacity().getUpper() == 0) {
            System.out.println("Вместимость: от " + getBusCapacity().getLower() + " мест");
        } else if (getBusCapacity().getLower() != 0 && getBusCapacity().getUpper() != 0) {
            System.out.println("Вместимость: " + getBusCapacity().getLower() + " - " + getBusCapacity().getUpper()+ " мест");
        }
    }
}
