package combined.employee_management;

import java.util.Map;

public class EmployeeManagementMain {
    public static void main(String[] args) {
        FullTimeEmployee emp1 = new FullTimeEmployee(101,"Aman",  50000, 5500);
        PartTimeEmployee emp2 = new PartTimeEmployee(102,"Rajesh",  0, 25, 80);

        for(Employee e : Employee.getEmployees().values()){
            e.displayEmployeeDetails();
            System.out.printf("Calculated Salary : Rs. %.0f\n", e.calculateSalary());
        }

    }
}
