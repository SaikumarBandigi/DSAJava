package leetcode.gametheory;

public class Nimgame {
    public static void main(String[] args) {
        System.out.println(new Nimgame().canWinNim(4));
    }
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}
