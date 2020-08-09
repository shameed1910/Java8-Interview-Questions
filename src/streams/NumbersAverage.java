package streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class NumbersAverage {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(8, 3, 4, 1, 7, 3);
        IntSummaryStatistics summaryStatistics=numbers.stream().mapToInt((x)->x).summaryStatistics();
        System.out.println(summaryStatistics.getAverage());

    }
}
