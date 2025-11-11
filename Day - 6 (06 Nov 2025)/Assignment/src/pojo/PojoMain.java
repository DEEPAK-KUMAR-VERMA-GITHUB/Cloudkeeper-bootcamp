package pojo;

import java.util.ArrayList;
import java.util.List;

public class PojoMain {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>(3);

        Customer customer1 = new Customer(1, "Aman Kumar", "aman@gmail.com");
        Customer customer2 = new Customer(1, "Rajesh Kumar", "rajesh@gmail.com");
        Customer customer3 = new Customer(1, "Karan Kumar", "karan@gmail.com");

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);

        for (Customer c : customers) {
            System.out.println(c);
        }
    }
}
