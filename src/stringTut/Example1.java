package stringTut;

import java.util.HashMap;

public class Example1 {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("pls enter args");
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (String s : args) {
            stringBuilder.append(s);
        }

        String s = stringBuilder.toString();


        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        for (char c : hashMap.keySet()) {
            System.out.println(c + " " + hashMap.get(c));
        }


    }
}
