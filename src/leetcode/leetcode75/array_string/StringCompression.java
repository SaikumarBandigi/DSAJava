package leetcode.leetcode75.array_string;

public class StringCompression {
    public static void main(String[] args) {
        StringCompression sc = new StringCompression();

        // Test case 1
        char[] chars1 = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int newLength1 = sc.compress(chars1);
        System.out.println(newLength1); // Output: 6
        System.out.println(new String(chars1, 0, newLength1)); // Output: "a2b2c3"

        System.out.println();

        // Test case 2
        char[] chars2 = {'a'};
        int newLength2 = sc.compress(chars2);
        System.out.println(newLength2); // Output: 1
        System.out.println(new String(chars2, 0, newLength2)); // Output: "a"

        System.out.println();

        // Test case 3
        char[] chars3 = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'}; // a b 1 2 b b b b b b b b b
        int newLength3 = sc.compress(chars3);
        System.out.println(newLength3); // Output: 4   // chars3 - {'a','b','1','2',......}  // only first 4 matters
        System.out.println(new String(chars3, 0, newLength3)); // Output: "ab12"

        System.out.println();

        char[] chars4 = {'a', 'a', 'b', 'b'};
        int newLength4 = sc.compress(chars4);
        System.out.println(newLength4); // 4
        System.out.println(new String(chars4, 0, newLength4));  // a2b2

        System.out.println();

        char[] chars5 = {'a', 'a', 'b'};
        int newLength5 = sc.compress(chars5);
        System.out.println(newLength5);
        System.out.println(new String(chars5, 0, newLength5));
    }

    public int compress(char[] chars) {  // a a b b
        int index = 0; // Pointer to update the chars array
        int i = 0;     // Pointer to traverse the chars array
        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;
            // Count the number of consecutive repeating characters
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }
            // Add the character to the array
            chars[index++] = currentChar;
            // If the count is greater than 1, add its digits to the array
            if (count > 1) {
                String countStr = String.valueOf(count);
                for (char c : countStr.toCharArray()) {
                    chars[index++] = c;
                }
            }
        }
        return index; // Return the new length of the array
    }


}
