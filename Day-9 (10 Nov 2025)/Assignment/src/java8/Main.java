package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        NumberRule isEven = n -> n % 2 == 0;
        NumberRule isPrime = n -> {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };

        List<Integer> nums = Arrays.asList(3, 10, 15, 8, 21, 14, 7);

        List<Integer> result = nums.stream()
                .filter(n -> isEven.apply(n) && isPrime.apply(n))
                .map(n -> (int) Math.pow(n, 2))
                .toList();

        for (int res : result) {
            System.out.println(res);
        }

//        optional
        Optional<Integer> firstSquaredNumber = result.stream()
               .findFirst();

//        in java 8
        if(firstSquaredNumber.isPresent()){
            System.out.println("First squared number is : " + firstSquaredNumber.get());
        }else {
            System.out.println("No matching number found");
        }

//        in java 9+
        firstSquaredNumber.ifPresentOrElse(
                n -> System.out.println("First squared number is : " + n),
                () -> System.out.println("No matching number found")
        );

    }
}
