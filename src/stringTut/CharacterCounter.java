package stringTut;

import java.util.HashMap;

public class CharacterCounter {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("please enter args");
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (String s : args) {
            stringBuilder.append(s);
        }

        String result = stringBuilder.toString();

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char c : result.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        for (char c : hashMap.keySet()) {
            System.out.println(c + " " + hashMap.get(c));
        }


    }
}

/*

In summary, length is used for arrays to get the number of elements,
 while length() is used for strings and similar character sequences to get the number of characters.

 */