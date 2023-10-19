package dz1;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc =new Scanner (System.in); // указываем класс Scanner для считывания введенных данных
        System.out.println ("one number");
        int a = sc.nextInt(); // Double- можно указать дробные числа, более точные вычисления //
        System.out.println("two number");
        int b = sc.nextInt();
        System.out.println("enter operation (+, -, *, /)"); //выбираем операцию из предложенных
        char operation =sc.next().charAt(0); // char хранит символы
        if(operation == '+'){
            int result = a + b;
            System.out.println( a + "+"+ b + "=" + result); // результат вычисления


        } if(operation == '-'){   int result = a - b;
            System.out.println( a + "-"+ b + "=" + result);
        } if(operation == '*'){ int result = a * b;
            System.out.println( a + "*"+ b + "=" + result);
        } if(operation == '/'){ int result = a / b;
             System.out.println( a+ "/" +b+ "=" + result);


}   }   }
