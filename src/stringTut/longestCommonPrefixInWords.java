package stringTut;

public class longestCommonPrefixInWords {
    public static String longestCommonPrefix(String[] arr) {
        if (arr == null || arr.length == 0)
            return "-1";
        String prefix = arr[0];
        for (int i = 1; i < arr.length; i++) {
            while (arr[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "-1";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] arr1 = {"geeksforgeeks", "geeks", "geek", "geezer"};

        System.out.println("Longest common prefix: " + longestCommonPrefix(arr1));
        String[] arr2 = {"hello", "world"};
        System.out.println("Longest common prefix: " + longestCommonPrefix(arr2));
    }
}


