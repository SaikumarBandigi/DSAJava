package leetcode.stringconcept;

public class ReverseOnlyAlphabets {
    public static void main(String[] args) {

        String s = "S1O2N3U4";
        System.out.println(new ReverseOnlyAlphabets().getReverseOnlyAlphabets(s));
    }

    String getReverseOnlyAlphabets(String s) {


        char[] arr = s.toCharArray();

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (Character.isLetter(arr[start]) && Character.isLetter(arr[end])) {
                rev(start, end, arr);
                start++;
                end--;
            } else if (!Character.isLetter(arr[start])) {
                start++;
            } else if (!Character.isLetter(arr[end])) {
                end--;
            }
        }
        return new String(arr);
    }

    void rev(int start, int end, char[] arr) {
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }


}
