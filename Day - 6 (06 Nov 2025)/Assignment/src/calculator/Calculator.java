package calculator;

import java.util.OptionalDouble;
import java.util.OptionalInt;

public final class Calculator {

    private Calculator() {
    }

    //    methods to add numbers
    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static double add(double number1, double number2) {
        return number1 + number2;
    }

    //    methods to subtract numbers
    public static int subtract(int number1, int number2) {
        return number1 - number2;
    }

    public static double subtract(double number1, double number2) {
        return number1 - number2;
    }

    //    methods to multiply numbers
    public static int multiply(int number1, int number2) {
        return number1 * number2;
    }

    public static double multiply(double number1, double number2) {
        return number1 * number2;
    }

    //    methods to divide numbers
    public static OptionalInt divide(int number1, int number2) {
        return number2 == 0 ? OptionalInt.empty() : OptionalInt.of(number1/number2);
    }

    public static OptionalDouble divide(double number1, double number2) {
        return number2 == 0.0 ? OptionalDouble.empty() : OptionalDouble.of(number1 / number2);
    }
}
