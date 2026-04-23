package practisetut;

public class Findthesumofallintegersfrom1to100thataredivisibleby3or5 {

    public static void main(String[] args) {
        int limit = 100;

        int result =
                sumDivisibleBy(3, limit) + sumDivisibleBy(5, limit) - sumDivisibleBy(15, limit); // avoid double counting

        System.out.println(result); // Output: 2418
    }

    // Returns sum of all multiples of 'n' up to 'limit'
    static int sumDivisibleBy(int n, int limit) {
        int count = limit / n;  // number of multiples
        return n * count * (count + 1) / 2;
    }

}
