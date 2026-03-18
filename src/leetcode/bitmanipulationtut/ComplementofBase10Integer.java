package leetcode.bitmanipulationtut;

public class ComplementofBase10Integer {

    public static void main(String[] args) {

        int n = 5;
        System.out.println(new ComplementofBase10Integer().bitwiseComplement(n));
    }

    public int bitwiseComplement(int n) {
        if (n == 0) return 1;

        String nBinary = Integer.toBinaryString(n);
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < nBinary.length(); i++) {
            if (nBinary.charAt(i) == '0') {
                res.append("1");
            } else {
                res.append("0");
            }
        }
        return Integer.parseInt(res.toString(), 2);
    }

}
