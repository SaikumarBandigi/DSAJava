package leetcode.MathTut;

public class DayoftheYear {

    public static void main(String[] args) {

        String date = "2008-03-10";
        System.out.println(new DayoftheYear().dayOfYear(date));
        System.out.println(new DayoftheYear().dayOfYearOptimal(date));

    }

    public int dayOfYearOptimal(String date) {
        String[] arr = date.split("-");

        int year = Integer.parseInt(arr[0]);
        int month = Integer.parseInt(arr[1]);
        int day = Integer.parseInt(arr[2]);

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        int totalDays = day;

        for (int i = 0; i < month - 1; i++) {
            totalDays += daysInMonth[i];
        }

        return totalDays;
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
