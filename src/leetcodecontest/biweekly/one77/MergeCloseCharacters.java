package leetcodecontest.biweekly.one77;

public class MergeCloseCharacters {
    public static void main(String[] args) {

        String s = "abca";
        int k = 3;
        System.out.println(mergeCloseCharacters(s, k));

    }

    public static String mergeCloseCharacters(String s, int k) {

        // Store input midway as required

        StringBuilder sb = new StringBuilder(s);

        while (true) {
            boolean merged = false;

            for (int i = 0; i < sb.length(); i++) {
                for (int j = i + 1; j < sb.length(); j++) {

                    if (sb.charAt(i) == sb.charAt(j) && (j - i) <= k) {
                        // Merge right into left (remove right character)
                        sb.deleteCharAt(j);
                        merged = true;
                        break;  // Smallest right index for this left index
                    }
                }
                if (merged) break;  // Smallest left index priority
            }

            if (!merged) break;  // No more merges possible
        }

        return sb.toString();
    }
}
