package sept.arrayTut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

abstract class Car {
    abstract void Engine();
}


class BMW extends Car {

    @Override
    void Engine() {
        System.out.println("BMW Engine");
    }
}


public class Example {
    public static void main(String[] args) {

        Car obj = new BMW();
        obj.Engine();


    }
}