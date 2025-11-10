package combined.employee_management;

import java.util.HashMap;

public abstract class Employee {
    private static HashMap<Integer, Employee> employees;
    private int employeeId;
    private String employeeName;
    private double baseSalary;

    static {
        employees = new HashMap<>();
    }

    public Employee(int employeeId, String employeeName, double baseSalary) {
        if(employees.containsKey(employeeId)){
            throw new IllegalArgumentException("Duplicated employee id");
        }
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.baseSalary = baseSalary;
        employees.put(employeeId, this);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getbaseSalary() {
        return baseSalary;
    }

    public static HashMap<Integer, Employee> getEmployees() {
        return employees;
    }

    public abstract double calculateSalary();

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeId + ", Name: " + employeeName + ", Base Salary: Rs. " + baseSalary);
    }
}
