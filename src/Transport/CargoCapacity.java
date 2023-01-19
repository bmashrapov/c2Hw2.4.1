package Transport;

public enum CargoCapacity {
    N1(null, 3.5f),
    N2(3.5f, 12.0f),
    N3(12.0f, null);

    private final Float lowerBound;
    private final Float upperBound;

    CargoCapacity(Float lowerBound, Float upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    @Override
    public String toString() {
        if (lowerBound == null && upperBound == null) {
            return "Грузоподъемность: неограниченная";
        } else if (lowerBound == null) {
            return String.format("Грузоподъемность: до %.1f тонн", upperBound);
        } else if (upperBound == null) {
            return String.format("Грузоподъемность: от %.1f тонн", lowerBound);
        } else {
            return String.format("Грузоподъемность: от %.1f тонн до %.1f тонн", lowerBound, upperBound);
        }
    }
    public Float getLowerBound() {
        return lowerBound;
    }

    public Float getUpperBound() {
        return upperBound;
    }
}