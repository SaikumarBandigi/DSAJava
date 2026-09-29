package leetcode.slidingwindowTut.fixed;

public class FindtheKBeautyofaNumber {
    public static void main(String[] args) {
        int num = 240;
        int k = 2;
        System.out.println(new FindtheKBeautyofaNumber().divisorSubstrings(num, k));
    }

    public int divisorSubstrings(int num, int k) {
        int count = 0;
        String s = String.valueOf(num);

        for (int i = 0; i <= s.length() - k; i++) {
            int window = Integer.parseInt(s.substring(i, i + k));
            if (window != 0 && num % window == 0) {
                count++;
            }
        }
        return count;
    }

    public int divisorSubstringsUsingSlidingWindow(int num, int k) {
        int count = 0;

        String word = String.valueOf(num);

        String s = "";
        for (int i = 0; i < k; i++) {
            s = s + word.charAt(i);
        }

        int window = Integer.parseInt(word);

        if (window != 0 && num % window == 0) {
            count++;
        }

        for (int i = k; i < word.length(); i++) {
            window = window % (int) Math.pow(10, k - 1);

            window = window * 10 + (s.charAt(i) - '0');

            if (window != 0 && num % window == 0) {
                count++;
            }
        }
        return count;
    }

}
