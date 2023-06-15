package Lectures.arraysandarraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList values = new ArrayList(2);
        values.add("sai");
        values.add("kumar");
        values.add("bandigi");

        values.add(2, "prashu");
        System.out.println(values.contains("sai"));
        values.set(0, "sonu");

//        for(Object o:values)
//            System.out.println(o);


        System.out.println(values.size());


        Iterator itr = values.iterator();


        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
