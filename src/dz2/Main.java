package dz2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) // while - этот цикл позволяет выполнить одну и ту же последовательность
            // повтор вызова калькулятора
        {
            System.out.println("one number");
            int a = sc.nextInt();
            System.out.println("Two number");
            int b = sc.nextInt();
            System.out.println("Case");
            int d = sc.nextInt();
            System.out.println("enter operation (+, -, *, /)"); //выбираем операцию из предложенных
            char operation = sc.next().charAt(0);

            if (operation == '+') {
                int result = a + b;
                System.out.println(a + "+" + b + "=" + result); // результат вычисления


            }
            if (operation == '-') {
                int result = a - b;
                System.out.println(a + "-" + b + "=" + result);
            }
            if (operation == '*') {
                int result = a * b;
                System.out.println(a + "*" + b + "=" + result);
            }
            if (operation == '/') {
                int result = a / b;
                System.out.println(a + "/" + b + "=" + result);


            }
            switch (d) { // выбор номера кейса с вычислением и записи сразу результата
                case 1:
                    System.out.printf("+: %d", a + b);
                    break;
                case 2:
                    System.out.printf("-: %d", a - b);
                    break;
                case 3:
                    System.out.printf("*: %d", a * b);
                    break;
                case 4:
                    System.out.printf("/: %d", a / b);
                    break;
                default:
                    System.out.println("Error");
            }


        }
    }
}
