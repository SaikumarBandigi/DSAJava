package stringTut;

public class StringRotatedby2Places {
    public static void main(String[] args) {
        String str1 = "azonam";
        String str2 = "amazon";
        System.out.println(isRotated(str1, str2));
    }
    private static boolean isRotated(String str1, String str2) {
        String rotatedLeft = rotateLeftBy2(str1);
        String rotatedRight = rotateRightBy2(str1);
        return str2.equals(rotatedLeft) || str2.equals(rotatedRight);
    }
    private static String rotateRightBy2(String str1) {
        if (str1.length() < 2) {
            return str1;
        }
        return str1.substring(str1.length() - 2) + str1.substring(0, str1.length() - 2);
    }

    private static String rotateLeftBy2(String str1) {
        if (str1.length() < 2) {
            return str1;
        }
        return str1.substring(2) + str1.substring(0, 2);
    }
}
