package accenture;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Example {
    public static void main(String[] args) {
        System.out.println(printFirstNEvens(5));
    }

    private static List<Integer> printFirstNEvens(int number) {

        return IntStream.iterate(0, i -> i + 2)
                .filter(i -> i % 2 == 0)
                .limit(number)
                .boxed()
                .collect(Collectors.toList());
    }
}

