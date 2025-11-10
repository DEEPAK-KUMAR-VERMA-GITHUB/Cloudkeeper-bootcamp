import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static int getDigitSum(int number) {
        int sum = 0;
        while (number != 0) {
            int remender = number % 10;
            sum += remender;
            number /= 10;
        }

        return sum;
    }

    private static void printTable(int number) {
        for (int itr = 1; itr <= 10; itr++) {
            System.out.println(number * itr);
        }
    }

    private static void calculateFactorial(int number) {
        long factorial = 1;
        for (int itr = 2; itr <= number; itr++) {
            factorial *= itr;
        }
        System.out.println("Factorial of " + number + " is : " + factorial);
    }

    private static int getDigitReversed(int number) {
        int reversed = 0;
        while (number != 0) {
            int remender = number % 10;
            reversed = (reversed * 10) + remender;
            number /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        ======= Variables and Control Flow =============
//        sum of digits
//        System.out.print("Enter any number : ");
//        int inputNumber = sc.nextInt();
//        int digitSum = getDigitSum(inputNumber);
//        System.out.println("Sum of digits for input " + inputNumber + " is : " + digitSum);

//    Multiplication Table
//        System.out.print("Enter any number to generate table : ");
//        int inputNumber = sc.nextInt();
//        printTable(inputNumber);

//        Factorial Calculator
//        System.out.print("Enter any number to calculate factorial : ");
//        int inputNumber = sc.nextInt();
//        calculateFactorial(inputNumber);

//        Reverse a Number
//        System.out.print("Enter any number to reverse : ");
//        int inputNumber = sc.nextInt();
//        System.out.println(getDigitReversed(inputNumber));

//        ============ Classes, Methods and Constructors=======
        System.out.println();
    }
}