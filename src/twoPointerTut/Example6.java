package twoPointerTut;

interface Bike {
    public abstract String get();

    public default String act() {
        return "sai";
    }

    public static String run() {
        return run1();
    }

    private static String run1() {
        return "running";
    }

}

class Pulsar implements Bike {

    @Override
    public String get() {
        return "getting";
    }


}

public class Example6 {
    public static void main(String[] args) {

        Pulsar obj = new Pulsar();
        System.out.println(obj.get());
        System.out.println(obj.act());

        System.out.println(Bike.run());

    }
}
