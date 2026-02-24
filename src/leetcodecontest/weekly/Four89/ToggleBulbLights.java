package leetcodecontest.weekly.Four89;

import java.util.ArrayList;
import java.util.List;

public class ToggleBulbLights {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(); // 10 30 20 10

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);

        System.out.println(toggleLightBulbs(list));
    }

    public static List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List<Integer> toggled = new ArrayList<>();

        for (Integer bulb : bulbs) {
            if (toggled.contains(bulb)) {
                // If already ON, toggle OFF (remove)
                toggled.remove(bulb);
            } else {
                // If OFF, toggle ON (add)
                toggled.add(bulb);
            }
        }

        return toggled;
    }

}
