package Lectures._06_contions_loops;

public class Switch {
    public static void main(String[] args) {

        String day = "Friday";

        String res = "";

        res = switch (day) {
            case "Monday" -> "mon";
            case "Tuesday" -> "tues";
            case "Friday" -> "fri";
            default -> "sun";
        };

        System.out.println(res);
    }
}
