package stringTut;

import java.util.ArrayList;
import java.util.List;

public class BitRotation {

    static ArrayList<Integer> rotateMethod(int N, int D) {
        ArrayList<Integer> list = new ArrayList<>();
        final int BIT_COUNT = 16;

        // Normalize D to be within 0 to 15
        D %= BIT_COUNT;

        int a = (N << D);
        int b = (N >>> (BIT_COUNT - D));

        int c = a | b;
        int leftRotated = c & 0xFFFF;

        // Left rotation
    //    int leftRotated = ((N << D) | (N >>> (BIT_COUNT - D))) & 0xFFFF;

        // Right rotation
        int rightRotated = ((N >>> D) | (N << (BIT_COUNT - D))) & 0xFFFF;

        list.add(leftRotated);
        list.add(rightRotated);
        return list;
    }

    public static void main(String[] args) {
        int N1 = 26;
        int D1 = 2;
        List<Integer> result1 = rotateMethod(N1, D1);
        System.out.println("Left Rotation: " + result1.get(0));
        System.out.println("Right Rotation: " + result1.get(1));
    }
}
