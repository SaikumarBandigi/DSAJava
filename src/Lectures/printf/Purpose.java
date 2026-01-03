package Lectures.printf;

import java.util.Arrays;

public class Purpose {
    public static void main(String[] args) {


//        int[] nums = {5, 7, 2, 4, 9};
//        int ce = 0, co = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] % 2 == 0)
//                ce++;
//             else
//                co++;
//        }
//        System.out.printf("%d,%d",ce,co);


        int num = 5;
        for(int i=1;i<=10;i++)
        {
            System.out.printf("%d x %d=%d\n",num,i,num*i);
        }


    }
}
