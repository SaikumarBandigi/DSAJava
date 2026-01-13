package leetcode.stringconcept;

public class StringCompression {
    public static void main(String[] args) {
        char[] chars = {'a', 'b'};
        int len = compress(chars);

        System.out.println(len);
        for (int i = 0; i < len; i++) {
            System.out.print(chars[i] + " ");
        }

    }

    static int compress(char[] chars) {

        // BASIC CONDITION
        if (chars.length == 1) {
            return 1;
        }


        int write = 0;   // index to write compressed data
        int i = 0;       // index to read input

        while (i < chars.length) {
            char current = chars[i];
            int count = 0;

            // count occurrences
            while (i < chars.length && chars[i] == current) {
                i++;
                count++;
            }

            // write character
            chars[write++] = current;

            // write count if >1
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }

}
