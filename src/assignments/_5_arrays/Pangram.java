package assignments._5_arrays;

import java.util.HashMap;

public class Pangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";

        boolean result = checkIfPangram(sentence);
        System.out.println(result);

    }

    public static boolean checkIfPangram(String sentence) {

        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < sentence.length(); i++){
            map.put(sentence.charAt(i),1);
        }
        if(map.size() == 26){
            return true;
        }
        return false;
    }
}
