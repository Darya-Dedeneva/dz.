package Fitness;
/*Этот класс реализует операции добавления и удаления посетителей.
 В нем также присутствует метод для вывода информации о посетителе.*/

import java.util.LinkedList;
import java.util.Scanner;

public class MembershipManagement {

    final private Scanner reader = new Scanner(System.in);

    public int getIntInput() {

        int value; //value — хранит значение – элемент списка
        Scanner sc = new Scanner(System.in);
        while (true) {
            String reader = sc.nextLine();
            try {
                value = Integer.valueOf(reader);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Not an int!"); //неверные данные (не целое число)
            }
        }
        System.out.println(value);

        return value;
    }

    public void printClubOptions() { //Метод просто использует вызовов System.out.println()
        System.out.println("Club Mercury");
        System.out.println("Club Neptune");
        System.out.println("Club Jupiter");
        System.out.println("Multi Clubs");

    }

    public int getChoice() { //получить выбор
        int choice = 0;
        System.out.println("WELCOME TO OZONE FITNESS CENTER");
        System.out.println("================================");
        System.out.println("Add Member"); //добавить участника
        System.out.println("Remove Member"); //Удалить элемент
        System.out.println("Display Member Information");//Отображать информацию о членах клуба
        System.out.println("Please select an option (or Enter -1 to quit):");//Пожалуйста, выберите опцию (или введите -1, чтобы выйти).:
        choice = getIntInput();
        return choice; //вернуть выбор
    }

    public String addMembers (LinkedList<Member> m) { //Добавить участников
        String name;
        int club;
        String mem;
        double fees;
        int memberID;
        Member mbr;
        Calculator <Integer> cal;

        System.out.println("Enter the name of the visitor");//Введите имя посетителя
        name = reader.nextLine();
        printClubOptions();
        System.out.println("enter the club ID"); //введите ID  клуба
        club = getIntInput();

        while (club < 1 || club > 4){
            System.out.print("\nInvalid Club ID. Please try again: "); //Недействительный ID клуба.Пожалуйста, попробуйте снова:
            club = getIntInput();
        }
        if (m.size() > 0)
            memberID = m.getLast().getMemberID() + 1;
        else
            memberID = 1;
        if (club != 4) {
            cal = (n)-> {
                switch (n) {
                    case 1:
                        return 900;
                    case 2:
                        return 950;
                    case 3:
                        return 1000;
                    default:
                        return -1;
                }
            };
            fees = cal.calculateFees(club);
            mbr = new SingleClubMember('S', memberID, name, fees, club);
            m.add(mbr);
            mem = mbr.toString();
            System.out.println("\nSTATUS: Single Club Member added\n"); //Добавлен член клуба
        }
        else
        {
            cal = (n) -> {
                if (n == 4)
                    return 1200;
                else
                    return -1;
            };
            fees = cal.calculateFees(club);
            mbr = new MultiClubMember('M', memberID,
                    name, fees, 100);
            m.add(mbr);
            mem = mbr.toString();
            System.out.println("\nSTATUS: Multi Club Member added\n"); //Добавлен член мультиклуба
            return mem;
        }

        if  (club == 4)

        { cal = (n) -> {
            /*if (n == 4)*/
                    return 1200;
            /*else
                return -1;*/
            };
            fees = cal.calculateFees(club);
            mbr = new MultiClubMember('M', memberID, name, fees, 100);
            m.add(mbr);
            mem = mbr.toString();
            System.out.println("\nSTATUS: Multi Club Member added\n"); //Добавлен участник нескольких клубов

        }

        return name;
    } public void removeMember(LinkedList<Member> m){ //Удалить участника клуба
        int memberID;
        System.out.print("\nenter the deletion ID: "); // Введите ID посетителя
        memberID = getIntInput();
        for (int i = 0; i<m.size();i++){
            if (m.get(i).getMemberID() == memberID){
                m.remove(i);
                System.out.println("ID deleted"); //ID удален
                return;
            }
        }

    }public void printMemberInfo(LinkedList<Member> m){ //показать информацию о посетителе
         int memberID;
        System.out.println("\nenter the visitor ID: "); //введите ID посетителя
        memberID = getIntInput();
        for (int i = 0; i <m.size() ; i++) {
            if (m.get(i).getMemberID() == memberID) {
                m.toString();
            } String[] memberInfo = m.get(i).toString().split(", ");
            System.out.println(memberInfo);
        }


    }
}