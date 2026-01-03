package assignments;

/* aaabbcccdd
  3a2b3c2d

 */
public class Example {
    public static String compressString(String input) {

        StringBuilder compressed = new StringBuilder();

        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(count).append(input.charAt(i - 1));
                count = 1;
            }
        }

        compressed.append(count).append(input.charAt(input.length() - 1));
        return compressed.toString();

    }

    public static void main(String[] args) {
        String input = "a";
        String compressed = compressString(input);
        System.out.println(compressed);  // Output: "3a2b3c2d"
    }
}
