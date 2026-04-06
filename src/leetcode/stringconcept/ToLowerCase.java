package leetcode.stringconcept;

public class ToLowerCase {

    public String toLowerCase(String s) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                sb.append(toLowerCase(s.charAt(i)));
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    char toLowerCase(char ch) {
        return Character.toLowerCase(ch);
    }

    public static void main(String[] args) {

        String s = "Hello";
        System.out.println(new ToLowerCase().toLowerCase(s));

    }

}
