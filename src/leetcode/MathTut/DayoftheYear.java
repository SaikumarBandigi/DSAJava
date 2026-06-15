package leetcode.MathTut;

public class DayoftheYear {

    public static void main(String[] args) {

        String date = "2008-10-10";
        System.out.println(new DayoftheYear().dayOfYear(date));

    }

    public int dayOfYear(String date) {
        String[] each = date.split("-");

        boolean isLeap = isLeapYear(Integer.parseInt(each[0]));

        int numberOfTotalDays = 0;

        if (isLeap) {
            if (each[1].equals("01")) {
                return Integer.parseInt(each[2]);
            }

            int previousDays = getPreviousDays(each[1], isLeap);
            numberOfTotalDays = previousDays + Integer.parseInt(each[2]);

        } else {
            if (each[1].equals("01")) {
                return Integer.parseInt(each[2]);
            }
            int previousDays = getPreviousDays(each[1], isLeap);
            numberOfTotalDays = previousDays + Integer.parseInt(each[2]);
        }
        return numberOfTotalDays;
    }

    public int getPreviousDays(String month, boolean isLeap) {

        if (isLeap) {
            return switch (month) {
                case "02" -> 31;
                case "03" -> 31 + 29;
                case "04" -> 31 + 29 + 31;
                case "05" -> 31 + 29 + 31 + 30;
                case "06" -> 31 + 29 + 31 + 30 + 31;
                case "07" -> 31 + 29 + 31 + 30 + 31 + 30;
                case "08" -> 31 + 29 + 31 + 30 + 31 + 30 + 31;
                case "09" -> 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31;
                case "10" -> 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
                case "11" -> 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
                case "12" -> 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
                default -> -1;
            };
        } else {
            return switch (month) {
                case "02" -> 31;
                case "03" -> 31 + 28;
                case "04" -> 31 + 28 + 31;
                case "05" -> 31 + 28 + 31 + 30;
                case "06" -> 31 + 28 + 31 + 30 + 31;
                case "07" -> 31 + 28 + 31 + 30 + 31 + 30;
                case "08" -> 31 + 28 + 31 + 30 + 31 + 30 + 31;
                case "09" -> 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
                case "10" -> 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
                case "11" -> 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
                case "12" -> 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
                default -> -1;
            };
        }
    }

    public static int getDaysIfIsLeap(String month) {
        return switch (month) {
            case "01", "03", "05", "07", "08", "10", "12" -> 31;
            case "04", "06", "09", "11" -> 30;
            case "02" -> 29;
            default -> -1;
        };
    }

    public static int getDaysIfNotLeap(String month) {
        return switch (month) {
            case "01", "03", "05", "07", "08", "10", "12" -> 31;
            case "04", "06", "09", "11" -> 30;
            case "02" -> 28;
            default -> -1;
        };
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }

        if (year % 100 == 0) {
            return false;
        }

        return year % 4 == 0;
    }

}
