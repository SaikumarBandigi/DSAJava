package stringTut;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;

public class KeyboardRowStream {
    public static void main(String[] args) {

        String[] words = {"qwerty"};
        System.out.println(getResult(words));
    }

    public static List<String> getResult(String[] words) {
        return Arrays.stream(words).filter(KeyboardRowStream::iSSingleRowWord).
                collect(Collectors.toList());

    }

    private static boolean iSSingleRowWord(String word) {
        String str = word.toLowerCase();

        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        return str.chars().allMatch(c -> row1.indexOf(c) >= 0) ||
                str.chars().allMatch(c -> row2.indexOf(c) >= 0) ||
                str.chars().allMatch(c -> row2.indexOf(c) >= 0);

    }

}
