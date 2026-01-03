package hackerrank;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class BigDecimalExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] s = new String[n];

        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }


        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                BigDecimal bigDecimal1 = new BigDecimal(o1);
                BigDecimal bigDecimal2 = new BigDecimal(o2);
                return bigDecimal2.compareTo(bigDecimal1); // Sort in descending order
            }
        };

        Arrays.sort(s, 0, n,stringComparator);

        System.out.println(Arrays.toString(s));


    }
}
