package jav;

public class BasicCalci {
    public static void main(String[] args) {
        new TestClass(3, 2).findMin();
    }
}

class TestClass {
    int a;
    int b;

    TestClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void findMin() {
        int min = Integer.MAX_VALUE;
        try {
            min = Integer.min(min, a + b);
            min = Integer.min(min, a - b);
            min = Integer.min(min, a * b);
            min = Integer.min(min, a / b);
        } catch (Exception e) {

        }
        System.out.println(min);
    }

}


