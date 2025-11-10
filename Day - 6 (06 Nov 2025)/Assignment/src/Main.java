import bank_account.BankAccount;
import calculator.Calculator;
import constructor.Book;
import constructor.Car;
import pojo.Customer;
import static_keywords.Counter;
import static_keywords.MathUtils;
import student_report.StudentReport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class Main {

    public static void main(String[] args) {
//        int div = Calculator.divide(5,0).orElse(0);
//        System.out.println(div);

//        StudentReport student1 = new StudentReport("Aman");
//        student1.setMarks(20,86,53);
//
//        System.out.printf("%s's total marks is : %.0f and average is %.2f", student1.getStudentName(), student1.getTotal().orElse(0f), student1.getAverageMarks().orElse(0f));

//        BankAccount customer1 = new BankAccount(123456789, "Aman Kumar", 200);
//        System.out.println(customer1);

//        Counter c1 = new Counter();
//        Counter c2 = new Counter();
//
//        System.out.println(Counter.getNumberOfInstances());

//        System.out.println(MathUtils.max(5,6));
//        System.out.println(MathUtils.min(5,6));
//        System.out.println(MathUtils.average(Arrays.asList(1,2,3,4,5)));

//        Book book1 = new Book("Head First Java", "Kathy Sierra & Bert Bates", 1036.60F);
//        System.out.println(book1);

//        Car car1 = new Car("Hyundai Creta EX(O) 1.5 Petrol ");
//        Car car2 = new Car("Jeep Compass Longitude 2.0 Diesel Sandstorm Edition", 2112000);
//
//        System.out.println(car1);
//        System.out.println(car2);

        List<Customer> customers = new ArrayList<>(3);

        Customer customer1 = new Customer(1, "Aman Kumar", "aman@gmail.com");
        Customer customer2 = new Customer(1, "Rajesh Kumar", "rajesh@gmail.com");
        Customer customer3 = new Customer(1, "Karan Kumar", "karan@gmail.com");

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);

        for(Customer c : customers){
            System.out.println(c);
        }
    }

}
