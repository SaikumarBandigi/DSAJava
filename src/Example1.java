import java.util.HashMap;
import java.util.Map;


public class Example1 {
    public static void main(String[] args) {
        int num = 3;
        System.out.println(fib(num));
    }

    static Map<Integer, Integer> map = new HashMap<>();

    static int fib(int num) {
        if (num <= 1) {
            return num;
        }

        if (map.containsKey(num)) {
            return map.get(num);
        }

        int result = fib(num - 1) + fib(num - 2);
        map.put(num, result);
        return result;
    }

}

