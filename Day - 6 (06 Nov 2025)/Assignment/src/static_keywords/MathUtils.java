package static_keywords;

import java.util.Comparator;
import java.util.List;

public class MathUtils<T extends Number & Comparable<T>> {

    public static <T extends Number & Comparable<T>> T max(T num1, T num2) {
        return num1.compareTo(num2) >= 0 ? num1 : num2;
    }

    public static <T extends Number & Comparable<T>> T min(T num1, T num2) {
        return num1.compareTo(num2) <= 0 ? num1 : num2;
    }

    public static <T extends Number> Double average(List<T> numbers) {
        return numbers.stream().mapToDouble(Number::doubleValue).average().orElse(0.0);
    }

}
