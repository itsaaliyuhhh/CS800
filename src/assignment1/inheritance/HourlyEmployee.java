package assignment1.inheritance;

public class HourlyEmployee extends Employee {
    private double hourlyWage;
    private double hoursWorked;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber,
                          double hourlyWage, double hoursWorked) {
        super(firstName, lastName, socialSecurityNumber);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return String.format("%s\nWage: %.2f\nHours Worked: %.2f", super.toString(), hourlyWage, hoursWorked);
    }
}
