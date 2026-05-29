package interviewTut.multithreadTut;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        List<Integer> list = Arrays.asList(1,2,3,4);

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            Integer i = it.next();

            if(i == 2){
                it.remove();
            }
        }

    }

}
