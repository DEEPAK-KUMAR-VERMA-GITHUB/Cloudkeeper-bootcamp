package calculator;

public class CalculatorMain {
    public static void main(String[] args) {
        int div = Calculator.divide(5,0).orElse(0);
        System.out.println(div);
    }
}
