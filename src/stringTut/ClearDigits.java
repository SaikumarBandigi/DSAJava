package stringTut;

public class ClearDigits {

    public static void main(String[] args) {
        String s = "cb34";
        System.out.println(new ClearDigits().clearDigits(s));
        System.out.println(new ClearDigits().clearDigitsAnother(s));
    }

    public String clearDigits(String s) {                // cb34
                                                         // 0123
        for (int i = 1; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {  // present char
                if (Character.isLetter(s.charAt(i - 1))) {  // prev char
                    s = s.substring(0, i - 1) + s.substring(i + 1);  // c4
                    i = 0; // restart because string length changed
                }
            }
        }

        return s;
    }

    public String clearDigitsAnother(String s) { //cb34
        StringBuilder sb = new StringBuilder(); // cb

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

}
