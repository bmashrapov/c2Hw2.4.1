package Transport;

public enum TypeOfBody {
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

    TypeOfBody(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Тип кузова: %s", name);
    }
}