package assignment1.inheritance;

public class CommissionEmployee extends Employee {
    private double commissionRate;
    private double grossSales;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                             double commissionRate, double grossSales) {
        super(firstName, lastName, socialSecurityNumber);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    @Override
    public String toString() {
        return String.format("%s\nCommission Rate: %.2f\nGross Sales: %.2f", super.toString(), commissionRate, grossSales);
    }
}
