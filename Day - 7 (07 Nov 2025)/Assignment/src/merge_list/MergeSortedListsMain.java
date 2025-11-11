package merge_list;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedListsMain {

    public static List<Integer> mergeSortedLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> mergedList = new ArrayList<>();

        int i = 0, j = 0;

        // Merge the two lists while there are elements in both
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        // Add any remaining elements from list1
        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        // Add any remaining elements from list2
        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }

    public static void main(String[] args) {
        // Test example
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // Add some sorted elements to both lists
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(7);

        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);

        List<Integer> mergedList = mergeSortedLists(list1, list2);

        // Print merged list
        System.out.println("Merged List: " + mergedList);
    }
}

