package target_sum;

import java.util.HashMap;
import java.util.List;

class Pair {
    int first;
    int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

public class TargetSum {

    public static Pair targetSumIndices(List<Integer> numbers, int target) {
        HashMap<Integer, Integer> numberMap = new HashMap<>();
        for (int i = 0; i < numbers.size(); i++) {
            int requiredPair = target - numbers.get(i);
            if (numberMap.containsKey(requiredPair)) {
                return new Pair(numberMap.get(requiredPair), i);
            }
            numberMap.put(numbers.get(i), i);
        }
        return new Pair(-1, -1);
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 7, 11, 15);
        int target = 22;

        Pair result = targetSumIndices(numbers, target);
        if (result.first != -1 && result.second != -1) {
            System.out.println("Indices of the two numbers that sum up to " + target + ": " + result.first + ", " + result.second);
        } else {
            System.out.println("No valid pair found.");
        }
    }

}
