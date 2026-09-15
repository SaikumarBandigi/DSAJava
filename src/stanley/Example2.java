package stanley;

public class Example2 {
    public static void main(String[] args) {

        String a = "A man, a plan, a canal: Panama";

        StringBuilder sb = new StringBuilder();

        for (char ch : a.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }

        String cleaned = sb.toString();
        String reversed = sb.reverse().toString();

        System.out.println(cleaned.equals(reversed));

    }
}
