package static_keywords;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Counter c1 = new Counter();
        Counter c2 = new Counter();

        System.out.println(Counter.getNumberOfInstances());

        System.out.println(MathUtils.max(5, 6));
        System.out.println(MathUtils.min(5, 6));
        System.out.println(MathUtils.average(Arrays.asList(1, 2, 3, 4, 5)));


    }
}
