package leetcode.leetcode75.array_string;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "     a     b       c       ";  // blue is sky the
        System.out.println(new ReverseWordsInAString().reverseWords(s));
    }

    public String reverseWords(String s) {
        StringBuilder stringBuilder = new StringBuilder();

        String trimmedStr = s.replaceAll("\\s+", " ").trim();
        String[] strings = trimmedStr.split(" ");

        for (int i = strings.length - 1; i >= 0; i--) { //  3   i>=0   i--
            stringBuilder.append(strings[i]);
            if (i > 0) {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }

}
