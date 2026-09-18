package stanley;

public class Example1 {

    public static void main(String[] args) {

        // Question 1
      //  String a1 = "Hello";
//        String b1 = "Hello";
//        System.out.println("Q1:");
//        System.out.println(a1 == b1);
//        System.out.println(a1.equals(b1));
//
//        // Question 2
       // String a2 = new String("Hello");
    //    String b2 = new String("Hello");
//        System.out.println("\nQ2:");
//        System.out.println(a2 == b2);
//        System.out.println(a2.equals(b2));
//
//        // Question 3
//        String a3 = "Java";
//        String b3 = new String("Java");
//        System.out.println("\nQ3:");
//        System.out.println(a3 == b3);
//        System.out.println(a3.equals(b3));









        String a = "Hello";
        String b = new String("Hello");
        String c = b.intern();

        System.out.println(a == c);


    }

}
