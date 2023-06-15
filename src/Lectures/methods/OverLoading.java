package Lectures.methods;

/*

same method name with different parameters.

method calling will be decided at compile time.

 */


public class OverLoading {
    public static void main(String[] args) {
        func();
        func(10);
    }

    static void func() {
        System.out.println("hi");
    }

    static void func(int a) {
        System.out.println("hi a");
    }


}

