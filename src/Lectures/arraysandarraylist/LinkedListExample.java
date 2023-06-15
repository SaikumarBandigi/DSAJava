package Lectures.arraysandarraylist;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {


        LinkedList values = new LinkedList();

        values.add("Latha");
        values.add("sai");
        values.add(2,"sonu");

        for(Object obj:values)
            System.out.println(obj);

    }
}
