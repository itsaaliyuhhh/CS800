package assignment1.inheritance;

public class EmployeeDriver {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee1 = new SalariedEmployee("Joe", "Jones",
                "111-11-1111", 2500);
        System.out.println(salariedEmployee1);

        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("Stephanie", "Smith",
                "222-22-2222", 25.00, 32);
        System.out.println(hourlyEmployee1);

        HourlyEmployee hourlyEmployee2 = new HourlyEmployee("Mary", "Quinn",
                "333-33-3333", 19.00, 47);
        System.out.println(hourlyEmployee2);

        CommissionEmployee commissionEmployee1 = new CommissionEmployee("Nicole", "Dior",
                "444-44-4444", 0.15, 50000.00);
        System.out.println(commissionEmployee1);

        SalariedEmployee salariedEmployee2 = new SalariedEmployee("Renwa", "Chanel",
                "555-55-5555", 1700.00);
        System.out.println(salariedEmployee2);

        BaseEmployee baseEmployee = new BaseEmployee(
                "Mike", "Davenport", "666-66-6666",
                95000.00);
        System.out.println(baseEmployee);

        CommissionEmployee commissionEmployee2 = new CommissionEmployee("Mahnaz", "Vaziri",
                "777-77-7777", 0.22, 40000.00);
        System.out.println(commissionEmployee2);
    }
}
