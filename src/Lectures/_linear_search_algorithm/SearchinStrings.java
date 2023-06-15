package Lectures._linear_search_algorithm;

import java.util.Arrays;

public class SearchinStrings {
    public static void main(String[] args) {

        String name = "saikumar";

        char target = 'a';

//        boolean b = searchChar2(name, target);
//        System.out.println(b);


        System.out.println(Arrays.toString(name.toCharArray()));
    }


    // you can use 2 types to do this serach //

//    private static boolean searchChar(String name, char target) {
//
//        if (name.length() == 0)
//            return false;
//
//        for (int i = 0; i < name.length(); i++) {
//
//            if (target==name.charAt(i)) {
//                return true;
//            }
//
//        }
//        return false;
//
//    }


    private static boolean searchChar2(String name, char target) {

        if (name.length() == 0)
            return false;

        for (char ch : name.toCharArray()) {
            if (target == ch) {
                return true;
            }
        }
        return false;
    }
}
