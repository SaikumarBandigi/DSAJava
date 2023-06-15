package Lectures._06_contions_loops;

public class Switch2 {
    public static void main(String[] args) {

        int empid = 2;

        String dept = "IT";

        switch (empid) {
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
            case 3 -> System.out.println("3");
            default -> {
                System.out.println("nothing");
                switch (dept) {
                    case "soft":
                        System.out.println("soft");
                    case "IT":
                        System.out.println("IT");
                        break;
                    default:
                        System.out.println("nothing");
                }
            }
        }

    }
}
