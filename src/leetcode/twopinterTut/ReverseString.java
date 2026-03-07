package leetcode.twopinterTut;

public class ReverseString {
    static void main() {

        char[] arr = {'s', 'a', 'i'};
        reverse(arr);
        System.out.println(arr);
    }

    static void reverse(char[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

    }

}
