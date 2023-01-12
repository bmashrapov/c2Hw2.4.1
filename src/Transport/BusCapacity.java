package Transport;

public enum BusCapacity {
    VERY_SMALL(0, 10),
    SMALL(10, 25),
    MEDIUM(40, 50),
    LARGE(60, 80),
    VERY_LARGE(100, 120);

    private final Integer lower;
    private final Integer upper;

    BusCapacity(Integer lower, Integer upper) {
        this.lower = lower;
        this.upper = upper;
    }

    @Override
    public String toString() {
        if (lower == 0 && upper != 0) {
            return String.format("Вместимость: до %d мест", upper);
        } else if (lower != 0 && upper == 0) {
            return String.format("Вместимость: от %d мест", lower);
        } else if (lower != 0 && upper != 0) {
            return String.format("Вместимость: %d - %d мест", lower, upper);
        }
        return toString();
    }

    public Integer getLower() {
        return lower;
    }

    public Integer getUpper() {
        return upper;
    }
}