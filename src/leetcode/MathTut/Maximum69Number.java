package leetcode.MathTut;

public class Maximum69Number {

    public static void main(String[] args) {

        int num = 9669;
        System.out.println(new Maximum69Number().maximum69Number(num));

    }

    public int maximum69Number(int num) {
        return Integer.parseInt(
                String.valueOf(num).replaceFirst("6", "9")
        );
    }

}
