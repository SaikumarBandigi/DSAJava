package Lectures._binary_search_algorithm;

public class Practise2 {
    public static void main(String[] args) {

        String s = "saikumar";
        char target = 's';
        boolean flag = false;

        while (!flag) {

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == target) {
                    System.out.println("found");
                    flag = true;
                }
            }
            break;
        }

        if (!flag) {
            System.out.println("not found");
        }

    }
}
