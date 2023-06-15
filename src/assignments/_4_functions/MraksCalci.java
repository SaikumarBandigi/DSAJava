package assignments._4_functions;

import java.util.Scanner;

public class MraksCalci {
    public static void main(String[] args) {

        System.out.println("Enter marks to know grade");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        String res = Calci(marks);
        System.out.println(res);
    }

    private static String Calci(int marks) {

        if (marks >= 91 && marks < 101) {
            return "AA";
        } else if (marks >= 81 && marks < 91) {
            return "BB";
        } else if (marks >= 71 && marks < 81) {
            return "CC";
        } else if (marks >= 61 && marks < 71) {
            return "DD";
        } else if (marks >= 51 && marks < 61) {
            return "EE";
        } else if (marks >= 41 && marks < 51) {
            return "FF";
        }
        return "FAIL";
    }
}
