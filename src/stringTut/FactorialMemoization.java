package stringTut;



import java.math.BigInteger;
import java.util.HashMap;

public class FactorialMemoization {
    static HashMap<BigInteger, BigInteger> map = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(factMemo(BigInteger.valueOf(5)));
    }

    public static BigInteger factMemo(BigInteger key) {
        if (key.equals(BigInteger.ZERO) || key.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        }
        if (map.containsKey(key)) {
            return map.get(key);
        }
        BigInteger result = key.multiply(factMemo(key.subtract(BigInteger.ONE)));
        map.put(key, result);
        return result;
    }
}
