package dz10;

import java.util.stream.Stream;

public class HashSet  {
    public String add;

    public static long add(Object o) {
        long result = 0;
        long startTime = System.currentTimeMillis();
        Object obj = new Object();
        for (int i = 0; i < 500000; i++){
            HashSet.add(obj);

        }
        result =System.currentTimeMillis() - startTime;

        return result;
    }
}
