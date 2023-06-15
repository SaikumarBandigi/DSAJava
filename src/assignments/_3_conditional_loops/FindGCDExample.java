package assignments._3_conditional_loops;

public class FindGCDExample {
    public static void main(String[] args) {

        int n1 = 60, n2 = 50;

        while (n1 != n2) {
            if (n1 > n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }
        System.out.println(n1);
    }
}
