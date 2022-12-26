package Transport;

public class Car<C extends DriverB> extends Transport implements Competing {
    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        COUPE("Купе"),
        STATION_WAGON("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        private final String name;

        BodyType(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return String.format("Тип кузова: %s", name);
        }
    }
    @Override
    public void printType() {
        System.out.println("Тип транспортного средства: " + getType());
    }
}



