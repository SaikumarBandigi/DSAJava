package leetcode.arrayconcept;

public class Example {
    public static void main(String[] args) {
        String s = "abb";
        System.out.println(get(s));
    }

    static String get(String s) {

        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                count++;
            } else {
                stringBuilder.append(count).append(s.charAt(i - 1));
                count = 1;
            }
        }
        stringBuilder.append(count).append(s.charAt(s.length() - 1));
        return stringBuilder.toString();
    }

}
