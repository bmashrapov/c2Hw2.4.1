package Transport;

import java.util.Objects;

public class Mechanic {
    final private String FullName;
    private String employeeCompany;
    final private VehicleRepairSpecification vehicleRepairSpecification;

    public Mechanic(String fullName, String employeeCompany, VehicleRepairSpecification vehicleRepairSpecification) {
        FullName = fullName;
        this.employeeCompany = employeeCompany;
        this.vehicleRepairSpecification = vehicleRepairSpecification;
    }

    public String getFullName() {
        return FullName;
    }

    public String getEmployeeCompany() {
        return employeeCompany;
    }

    public void setEmployeeCompany(String employeeCompany) {
        if (employeeCompany == null || employeeCompany.isBlank() || employeeCompany.isEmpty()) {
            this.employeeCompany = " механик автодрома ";
        } else {
            this.employeeCompany = employeeCompany;
        }
    }

    public VehicleRepairSpecification getVehicleRepairSpecification() {
        return vehicleRepairSpecification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return Objects.equals(FullName, mechanic.FullName) && Objects.equals(employeeCompany, mechanic.employeeCompany) && vehicleRepairSpecification == mechanic.vehicleRepairSpecification;
    }

    @Override
    public int hashCode() {
        return Objects.hash(FullName, employeeCompany, vehicleRepairSpecification);
    }

    @Override
    public String toString() {
        return getFullName() + " из компании " + getEmployeeCompany() + " с классификацией " + getVehicleRepairSpecification();

    }
}
