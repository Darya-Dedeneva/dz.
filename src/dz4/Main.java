package dz4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello my Friend");
        while (true) {
            System.out.println("One number");
            int a = sc.nextInt();
            System.out.println("Two number");
            int b = sc.nextInt();
            System.out.println("Enter operation: 1 -\"+\", 2 - \"-\", 3 -\"*\", 4 - \"/ \", 5 - Exit");
            int oper = sc.nextInt();
            if (oper == 5) System.exit(0);

            int temp = operation(a, b, oper);

            while (true) {
                System.out.println("Input 2 int");
                b = sc.nextInt();
                System.out.println("Operation: 1 - \"+\", 2 - \"-\", 3- Exit");
                oper = sc.nextInt();
                temp = operation(temp, b, oper);
            }


        }
    }

    static int sum(int a, int b) {
        System.out.printf("Summa %d + %d = %d \n", a, b, a + b);
        return a + b;
    }

    static void razn(int a, int b) {
        System.out.printf("Razn %d - %d = %d \n", a, b, a - b);
    }

    static int operation(int a, int b, int oper) {
        int temp = 0;
        switch (oper) {
            case 1:
                temp = sum(a, b);
                break;
            case 2:
                razn(a, b);
                break;
            case 3:
                System.exit(0);
                break;
            default:
            System.out.println("Error");
        }


        return temp;
    }
}


