package dz12;
/*ДЗ: Создайте программу ToDo: список задач.
Приложение должно создавать задачу и добавлять в список. Можно завершить задачу - сделать ее выполненной.
Также необходимо выполнить сохранение и считывание задач в файл. При запуске приложения -
данные о невыполненных заданиях должны считываться из файла и добавляться в список.
 */



import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String deal = scanner.nextLine();
        List<Todo> todoList = new ArrayList<>();
        Todo todo = new Todo(1, "New task");
        String comand = scanner.nextLine();
        String[] task = comand.split(" "); // task - задача add


        System.out.println(todo);
        todoList.add(todo);
        saveListFile();
    }

    private static void saveListFile() {
    }


    private static  void saveListFile (List <String > todoList) {

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Гость\\Desktop\\Java23-15\\Новая папка\\1.txt", false))) {
                String t = "Welcome to the Private club\n";
                for (int i = 0; i < todoList.size(); i++) {
                    t += todoList.get(i);
                }
                writer.write(t);
                System.out.println("Done");
            } catch (IOException e) {
                e.printStackTrace();
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Гость\\Desktop\\Java23-15\\Новая папка\\1.txt", false))) {
                String t = "Welcome to the Private club\n";
                Scanner scanner = new Scanner(System.in);
                List<Todo> tList = new ArrayList<>();
                todoList.add(0, "Стать клиентом клуба");
                todoList.add(1, "Оставить заявку");
                todoList.add(2, "Оставить заявку на акцепт");

                while (true) {

                    String comanda = scanner.nextLine();
                    String[] task = comanda.split(" ");
                    for (int i = 0; i < task.length; i++) {
                        if (task[i].equals("LIST")) {
                            for (int j = 0; j < todoList.size(); j++) {
                                System.out.println(todoList.get(j));
                            }
                        } else if (task[0].equals("ADD") && task.length == 2) {
                            todoList.add(task[1]);
                            System.out.println("Вы добавили новое дело в конец списка:");
                            for (int j = 0; j < todoList.size(); j++) {
                                System.out.println(todoList.get(j));
                            }
                            break;
                        } else if (task[0].equals("ADD") && task.length > 2) {
                            todoList.add(Integer.parseInt(task[1]) - 1, task[2]);
                            System.out.println("Вы добавили новое дело: " + task[2] + ", в позицию номер: " + task[1] + "\nИзмененный список дел:");
                            for (int j = 0; j < todoList.size(); j++) {
                                System.out.println(todoList.get(j));
                            }
                            break;

                        } else if (task[0].equals("DELETE") && task.length == 2) {
                            System.out.println("Вы удалили дело " + todoList.get(Integer.parseInt(task[1]) - 1) + ", которое было в позиции номер: " + task[1] + "\nИзмененный список дел:");
                            todoList.remove(Integer.parseInt(task[1]) - 1);
                            for (int j = 0; j < todoList.size(); j++) {
                                System.out.println(todoList.get(j));
                            }
                            break;
                        } else {
                            System.out.println("Не верная команда. Вызовите правильну команду:");
                        }
                        System.out.println("Command: \nLIST;n\start;\nADD;\nEDIT;\nDELETE;\nstart a team");

                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


}





