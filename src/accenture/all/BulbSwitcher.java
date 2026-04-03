package accenture.all;

public class BulbSwitcher {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(new BulbSwitcher().bulbSwitch(n));
    }

    public int bulbSwitch(int n) {
        return (int) Math.sqrt(n);
    }
}
