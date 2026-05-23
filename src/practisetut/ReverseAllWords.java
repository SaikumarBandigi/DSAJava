package practisetut;

import java.util.Arrays;

public class ReverseAllWords {

    public static void main(String[] args) {

        String word = "sai kumar isha shree";
        System.out.println(new ReverseAllWords().reverseEm(word));

    }

    String reverseEm(String str) {

        String[] words = str.split(" ");
        rev(words, 0, words.length - 1);
        return String.join(" ", words);
    }

    void rev(String[] arr, int start, int end) {
        while (start < end) {
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
