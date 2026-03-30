package accenture.all;

public class ReverseWordsInAString {
    public static void main(String[] args) {

        String s = "   the sky is blue  ";
        System.out.println(new ReverseWordsInAString().reverseWords(s));

    }

    public String reverseWords(String s) {
        String actualWord = s.trim();
        String[] words = actualWord.split("\\s+");
        rev(words);
        return String.join(" ", words);
    }

    void rev(String[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }


}
