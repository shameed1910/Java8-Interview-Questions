package streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FIndDuplicates {
    public static void main(String[] args) {
        int[] inputArray = new int[]{111, 333, 444, 555, 333, 555};
        List<String> list = Arrays.asList("abc", "def", "ghi", "jklm", "dd", "abc");

        findDuplicates(inputArray);
        findDuplicates1(list);

    }

    private static void findDuplicates(int[] inputArray) {
        Set<Integer> uniqueElements = new HashSet<Integer>();
        Set<Integer> duplicateElements = Arrays.stream(inputArray).
                filter(i -> !uniqueElements.add(i)).boxed().collect(Collectors.toSet());
        System.out.println(duplicateElements);

    }

    private static void findDuplicates1(List<String> list) {
        Set<String> uniqueElements = new HashSet<>();
        Set<String> result = list.stream()
                .filter(i -> !uniqueElements.add(i))
                .collect(Collectors.toSet());
        System.out.println(result);

    }
}
