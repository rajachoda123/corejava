package java8;

import java.util.IntSummaryStatistics;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        // 1. summary statistics
        IntSummaryStatistics intSummaryStatistics = IntStream.rangeClosed(1, 100)
                .filter(num -> num % 2 != 0)
                .limit(10)
                .summaryStatistics();
        System.out.println("sum of first 10 odd numbers:  "+intSummaryStatistics.getSum());
        Predicate<Integer> odd = num -> num%2 !=0;
        //using predicate
        int sumOfOdd = IntStream.rangeClosed(1, 20)
                .boxed()
                .filter(odd)
                .limit(10)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("using predicate sum is : " + sumOfOdd);
        // 3. Traditional approach
        int number = 0;
        int sum = 0;
        int count =0;

        while (count < 10 ) {
            if (number %2 != 0) {
                sum += number;
                count++;
            }
            number++;
        }
        System.out.println("old approach: "+ sum);

    }
}
