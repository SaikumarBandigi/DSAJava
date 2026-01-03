package stringTut;

public class BinaryChecker {
    public static int isBinary(String str) {
        for (char c : str.toCharArray()) {
            if (c != '0' && c != '1') {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(isBinary("101")); // Output: 1
        System.out.println(isBinary("75"));  // Output: 0
        System.out.println(isBinary("0101")); // Output: 1
        System.out.println(isBinary("123"));  // Output: 0
    }
}
