package dz11;



import java.util.Collection;
import java.util.HashMap;




/*
Д/3 Создать коллекцию hashmap и метод генерации уникальных String идентификаторов.
При генерации нового элемента проверяйте наличие элемента в коллекции с таким id.
Добавьте в коллекцию 10 000 элементов.
В качестве value можно использовать new String();

 */


public class Main {


    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Dasha");
        map.put(2, "Valery");
        map.put(3, "Svetlana");


        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));

        
            /*
        boolean containsKey = HashMap.containsKey("Dasha", 1);
        System.out.println("map.put():" + containsKey);*/

        Collection<String> values = map.values();
        System.out.println(values);
        System.out.println(map.containsKey(4)); /*boolean containsKey-
        - проверяет наличия ключа в коллекции
        возвращает true, если коллекция содержит данный элемент*/
        System.out.println(map.containsValue("dasha")); /* containsValue -
        проверяет содержания значения */

       for (Integer integer : map.keySet()) {
            System.out.println("key = " + integer); //получение множества всех ключей//
            for (int i = 0; i < 10000; i++) {
                System.out.println(map);




            }
        }
    }


}


           