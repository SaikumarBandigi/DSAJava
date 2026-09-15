package stanley;

import java.util.Arrays;

public class ReverseAString {


    public static void main(String[] args) {

        char[] arr = {'j', 'a', 'v', 'a'};

//        char[] res = new char[arr.length];
//
//        int index = 0;
//        for (int i = arr.length - 1; i >= 0; i--) {
//            res[index++] = arr[i];
//        }
//
//        System.out.println(Arrays.toString(res));

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.println(Arrays.toString(arr));


    }

}
