package jav;


// 1 3 5 7 9 11
public class DeleteAlternateCharacters {
    public static void main(String[] args) {
        System.out.println(delAlternate("komal")); // kml
    }

    static String delAlternate(String S) {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if (isOdd(i)) {

            } else {
                stringBuilder.append(S.charAt(i));
            }
        }
        return stringBuilder.toString();
    }


    static boolean isOdd(int N) {
        return (N % 2 != 0);
    }

}
