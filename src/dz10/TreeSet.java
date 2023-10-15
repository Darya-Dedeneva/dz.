package dz10;

import java.util.SortedSet;

public class TreeSet{

    public static void add (Object o) {
        long result = 0;
        long startTime = System.currentTimeMillis();
        Object obj = new Object();
        for (int i=0; i<500000; i++){
         TreeSet.add(obj);


        }
        result = System.currentTimeMillis() - startTime;

    }


}
