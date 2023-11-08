package Fitness;
/*Обработчик файлов*/


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;


public class FileHandler {

     public LinkedList<Member>  readFile(){
          /* создан объект Scanner, который читает данные из файла "members.csv"
          Каждую считанную строку мы добавляем в список Member*/

     LinkedList <String> Member = new LinkedList<> ();
          try (Scanner scanner = new Scanner(new File("members.csv "))) {
               while (scanner.hasNext()) {
                    String member = scanner.nextLine();
                  Member.add(member);
                    Member.add("Type"+"bonus"); // тип посетителя +бонус
                    Member.add("ID"); //id посетителя
                    Member.add("Name"); // имя посетителя
                    Member.add("Fees"); // членский взнос
                    Member.add("ID club"); // клуб посетителя
               }
          } catch (FileNotFoundException e) {
               e.printStackTrace();
          }
          System.out.println("LinkedList: " + Member);

          return null;
     } public void appendFile(String mem) { // добавляет
          try (FileWriter writer = new FileWriter("members.csv", false)) {
               String file = new String(mem);
               writer.write(file);


          } catch (IOException e) {
               throw new RuntimeException(e);
          }

     } public void overwriteFile(LinkedList<Member> m){ //перезаписать файл *запишите данные в временный файл подобно обычному файлу
          // удалите при завершении программы
        try {   File tmpFile =File.createTempFile("members.csv", null);
                File newFile = File.createTempFile("members.csv", String.valueOf(new File("members.temp")));
             System.out.println(tmpFile.getCanonicalFile());
             System.out.println(newFile.getCanonicalFile());
             tmpFile.deleteOnExit();
             newFile.deleteOnExit();

     } catch (IOException e) {
          throw new RuntimeException(e);
     }
}


}





