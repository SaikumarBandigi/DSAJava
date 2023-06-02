package assignments._1;

public class _1LeapYear {
    public static void main(String[] args) {

        int year = 1900;


       if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            System.out.println("Specified year is a leap year");
       else
           System.out.println("Specified year is not a leap year");


//        if (year % 400 == 0) {
//            System.out.println("leap year");
//        } else if ((year % 4 == 0) && (year % 100 != 0))
//            System.out.println("leap year");
//        else
//            System.out.println("not a leap year");


    }
}
