package dz9;

import java.util.*;


public class Main {


    public static void main (String[] args){

        ArrayList<Number> arrayList = new ArrayList<>(); //коллекция ArrayList
        for (int i = 0; i < 500000; i++){
            arrayList.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i<arrayList.size(); i++)
            arrayList.get(i);
        long end =System.currentTimeMillis();
        System.out.println("Time Arraylist" + (start-end) + "ms");


        LinkedList<Number> linkedList = new LinkedList<>(); //коллекция LinkedList
        for (int i = 0; i < 500000; i++)
        linkedList.add(i);
        start = System.currentTimeMillis();

        for (Number x : linkedList) // ускорить процесс измерения времени элемента LinkedList

        end =System.currentTimeMillis();
        System.out.println("Time Linkedlist" + (start-end) + "ms");

        System.out.println(arrayList.equals(linkedList)); // сравнение элементов класса




    }



}

