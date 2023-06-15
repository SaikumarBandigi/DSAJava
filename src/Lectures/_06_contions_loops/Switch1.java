package Lectures._06_contions_loops;

public class Switch1 {
    public static void main(String[] args) {

//        int day = 6;
//
//        switch (day) {
//            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
//            case 6, 7 -> System.out.println("Weekend");
//        }

        /* or */

        int day = 2;

        switch (day) {

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("weekday");
                break;
            case 6:
            case 7:
                System.out.println("weekend");


        }


    }
}
