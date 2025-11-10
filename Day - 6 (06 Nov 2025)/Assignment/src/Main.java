import bank_account.BankAccount;
import calculator.Calculator;
import student_report.StudentReport;

import java.util.OptionalInt;

public class Main {

    public static void main(String[] args) {
//        int div = Calculator.divide(5,0).orElse(0);
//        System.out.println(div);

//        StudentReport student1 = new StudentReport("Aman");
//        student1.setMarks(20,86,53);
//
//        System.out.printf("%s's total marks is : %.0f and average is %.2f", student1.getStudentName(), student1.getTotal().orElse(0f), student1.getAverageMarks().orElse(0f));

        BankAccount customer1 = new BankAccount(123456789, "Aman Kumar", 200);
        System.out.println(customer1);


    }

}
