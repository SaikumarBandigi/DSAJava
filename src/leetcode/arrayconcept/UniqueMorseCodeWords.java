package leetcode.arrayconcept;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueMorseCodeWords {

    public static void main(String[] args) {

        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(new UniqueMorseCodeWords().uniqueMorseRepresentations(words));
    }

    public int uniqueMorseRepresentations(String[] words) {

        String[] res = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            res[i] = getDotnDash(words[i]);
        }

        Set<String> set = new HashSet<>();

        for (String word : res) {
            set.add(word);
        }

        return set.size();
    }

    String getDotnDash(String word) {

        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
                "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
                "..-", "...-", ".--", "-..-", "-.--", "--.."};

        Map<Character, String> map = new HashMap<>();


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            map.put((char) (i + 'a'), morse[i]);
        }

        for (char ch : word.toCharArray()) {
            sb.append(map.get(ch));
        }
        return sb.toString();
    }

}

