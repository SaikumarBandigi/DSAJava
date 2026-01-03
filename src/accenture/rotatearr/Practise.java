package accenture.rotatearr;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Practise {
    public static void main(String[] args) {

        Integer[] array = {1, 2, 3, 4, 5};
        int rotations = 6;

        List<Integer> list = Arrays.asList(array);
        rotateArray(list, rotations);
          System.out.println(list);

    }

    private static void rotateArray(List<Integer> list, int rotations) {
        int size = list.size();
        rotations = rotations % size;

        Collections.rotate(list, rotations);

    }
}
