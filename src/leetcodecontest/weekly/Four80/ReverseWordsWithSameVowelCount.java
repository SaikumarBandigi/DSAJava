package leetcodecontest.weekly.Four80;

public class ReverseWordsWithSameVowelCount {
    public static void main(String[] args) {
        System.out.println(new ReverseWordsWithSameVowelCount().reverseWords("cat and mice"));
    }

    public String reverseWords(String s) {

        String[] words = s.split(" ");

        int firstWordVowelCount = 0;

        String word = words[0];
        for (char ch : word.toCharArray()) {
            if (isVowel(ch)) {
                firstWordVowelCount++;
            }
        }

        for (int i = 1; i < words.length; i++) {
            String secondWord = words[i];
            int secondWordVowelCount = 0;
            for (char ch : secondWord.toCharArray()) {
                if (isVowel(ch)) {
                    secondWordVowelCount++;
                }
            }
            if (secondWordVowelCount == firstWordVowelCount) {
                String res = reverse(secondWord);
                words[i] = res;
            }
        }

        String result = String.join(" ", words);
        return result;
    }

    boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

}
