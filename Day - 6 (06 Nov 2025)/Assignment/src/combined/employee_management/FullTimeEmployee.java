package combined.employee_management;

public class FullTimeEmployee extends Employee{
    private double annualBonus;

    public FullTimeEmployee(int employeeId, String employeeName, double baseSalary, double annualBonus) {
        super(employeeId, employeeName, baseSalary);
        this.annualBonus = annualBonus;
    }

    @Override
    public double calculateSalary() {
        return getbaseSalary() + annualBonus;
    }

    @Override
    public void displayEmployeeDetails() {
        super.displayEmployeeDetails();
        System.out.println("Annual Bonus : Rs. " + annualBonus);
    }
}
