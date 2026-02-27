package leetcode.MathTut;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {

        System.out.println(convertToTitle(28));

    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // Adjust because Excel column indexing starts at 1
            int remainder = columnNumber % 26;
            result.append((char) ('A' + remainder));
            columnNumber = columnNumber / 26;
        }
        return result.reverse().toString();
    }

}
