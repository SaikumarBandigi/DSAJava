package interviewTut;

class T {
    static int y;

    T(int n) {
        y += n;
    }

    T() {
        this(y);
    }
}

public class Main {

    public static void main(String[] args) {

        T.y = 10;
        T t = new T();

        t = null;

        System.out.println(t.y);

    }

}