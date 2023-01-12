package Transport;

import java.util.Objects;

public class Driver {
    private final String fullName;
    private boolean typeOfLicence;
    private final int experience;

    public Driver(String fullName, boolean typeOfLicence, int experience) {
        this.fullName = fullName;
        this.typeOfLicence = typeOfLicence;
        this.experience = experience;
    }

    public void startMoving() {
        System.out.println(fullName + " начинает движение");
    }

    public void stopMoving() {
        System.out.println(fullName + " остановился");
    }

    public void fillTheTransport() {
        System.out.println(fullName + " заправляет авто");
    }

    @Override
    public String toString() {
        return "Driver{" +
                "fullName='" + fullName + '\'' +
                ", typeOfLicence=" + typeOfLicence +
                ", experience=" + experience +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return typeOfLicence == driver.typeOfLicence && experience == driver.experience && Objects.equals(fullName, driver.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, typeOfLicence, experience);
    }

    public String getFullName() {
        return fullName;
    }

    public boolean isTypeOfLicence() {
        return typeOfLicence;
    }

    public int getExperience() {
        return experience;
    }
}
