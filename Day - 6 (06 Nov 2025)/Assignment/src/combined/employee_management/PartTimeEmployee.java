package combined.employee_management;

public class PartTimeEmployee extends Employee {

    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(int employeeId, String employeeName, double baseSalary, double hourlyRate, int hoursWorked) {
        super(employeeId, employeeName, baseSalary);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void displayEmployeeDetails() {
        super.displayEmployeeDetails();
        System.out.println("Hourly Rate: $" + hourlyRate + ", Hours Worked: " + hoursWorked);
    }
}
