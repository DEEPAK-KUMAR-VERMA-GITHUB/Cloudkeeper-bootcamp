package exception_handling;

import java.util.Scanner;

public class ExceptionHandlingMain {
    private static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        return input.nextInt();
    }

    private static String readLine() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static void main(String[] args) {
//        System.out.println("Please input two numbers to perform division");
//        int number1 = readNumber();
//        int number2 = readNumber();
//
//        try{
//            int division = number1 / number2;
//            System.out.println(division);
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }finally {
//            System.out.println("Division Completed");
//        }

//        try {
//            // Outer try block
//            int[] numbers = {1, 2, 3, 4, 5};
//            System.out.println("Outer try block started.");
//
//            // This could throw ArrayIndexOutOfBoundsException
//            System.out.println("Accessing index 10: " + numbers[10]);
//
//            try {
//                // Inner try block
//                System.out.println("Inner try block started.");
//                // This could throw ArithmeticException
//                int result = 10 / 0;  // Division by zero
//            } catch (ArithmeticException e) {
//                System.out.println("Caught ArithmeticException in inner try block: " + e.getMessage());
//            }
//
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Caught ArrayIndexOutOfBoundsException in outer try block: " + e.getMessage());
//        }

        System.out.print("Please input your email here : ");
        try {
            String email = readLine();
            if (!email.contains("@")) {
                throw new InvalidEmailException("Invalid Email Input");
            }
            System.out.printf("Valid email : %s", email);
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }


    }
}
