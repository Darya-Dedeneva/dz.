package Project1;
/*Этот класс реализует операции добавления и удаления посетителей.
 В нем также присутствует метод для вывода информации о посетителе.*/

import java.util.Scanner;

public class MembershipManagement {

   final private Scanner reader = new Scanner(System.in);

    public int getIntInput() {

        int number;
        Scanner sc = new Scanner(System.in);
        while (true) {
            String reader = sc.nextLine();
            try {
                number = Integer.valueOf(reader);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Not an int!"); //неверные данные (не целое число)
            }
        }
        System.out.println(number);

        return 0;
    } public void printClubOptions(){ //Метод просто использует вызовов System.out.println()
        System.out.println("Club Mercury");
        System.out.println("Club Neptune");
        System.out.println("Club Jupiter");
        System.out.println("Multi Clubs");

    } public int getChoice(){



        return 0;
    }

}
