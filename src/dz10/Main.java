package dz10;


import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;


import static dz10.LinkedList.addElements;
import static java.util.Collections.addAll;

public class Main {

    private static long addElements;


    public static void main (String [] args){
        List<String> Linklist = new LinkedList<>();
        System.out.println("LinkedList" + "\n"+ addElements(Linklist));
        List<String> ArrList = new ArrayList<>();
        System.out.println("ArrayList" + "\n" + addElements(ArrList));
        TreeSet ts  = new TreeSet();
        System.out.println("TreeSet" + "\n"+ addAll(ts));
        HashSet Set = new HashSet();
        System.out.println("Hashset" + "\n"+ Set.add);




    }


}






