package interviewTut.streamapiTut;

import java.util.Arrays;
import java.util.List;

public class SortUsingStreams {

    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(5,2,9,1);

        list.stream()
                .sorted()
                .forEach(System.out::println);

    }

}
