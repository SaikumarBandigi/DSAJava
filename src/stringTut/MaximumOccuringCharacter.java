package stringTut;

import java.util.HashMap;

public class MaximumOccuringCharacter {
    public static void main(String[] args) {
        String s = "output"; // o1 u2 t2 p1
        System.out.println(getMaxOccurringChar(s));
    }
    public static char getMaxOccurringChar(String str) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        char maxChar = ' ';
        int maxFrequency = 0;
        for (char c : frequencyMap.keySet()) {
            int currentFrequency = frequencyMap.get(c);
            // Check if the current character has a higher frequency or is lexicographically smaller in case of a tie
            if (currentFrequency > maxFrequency || (currentFrequency == maxFrequency && c < maxChar)) {
                maxFrequency = currentFrequency;
                maxChar = c;
            }
        }

        return maxChar;
    }
}
