package leetcode.MathTut;

public class AngleBetweenHandsofaClock {

    public static void main(String[] args) {

        int hour = 3, minutes = 30;
        System.out.println(new AngleBetweenHandsofaClock().angleClock(hour, minutes));

    }

    public double angleClock(int hour, int minutes) {

        int minuteAngle = getAngleExceptHours(minutes);

        double hourAngle = (hour % 12) * 30 + (minutes * 0.5);

        double angle = Math.abs(hourAngle - minuteAngle);

        return Math.min(angle, 360 - angle);
    }

    int getAngleExceptHours(int minutes) {

        return switch (minutes) {
            case 0 -> 0;
            case 5 -> 30;
            case 10 -> 60;
            case 15 -> 90;
            case 20 -> 120;
            case 25 -> 150;
            case 30 -> 180;
            case 35 -> 210;
            case 40 -> 240;
            case 45 -> 270;
            case 50 -> 300;
            case 55 -> 330;
            default -> minutes * 6;
        };
    }

}
