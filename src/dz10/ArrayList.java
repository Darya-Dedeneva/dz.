package dz10;

import java.util.List;

public class ArrayList {


    public static long addElements (List  List){
        long result = 0;
        long startTime = System.currentTimeMillis();
        String str = new String();
        for (int i=0; i<500000; i++){
            List.add(str);


        }
        result = System.currentTimeMillis() - startTime;
        return result;
    }


}
