package P6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println ("one number");
        double a = sc.nextDouble(); // Double- можно указать дробные числа, более точные вычисления //
        System.out.println("two number");
        double b = sc.nextDouble();
        System.out.println("enter operation (1, 2, 3, 4)"); //выбираем операцию из предложенных
        char operation =sc.next().charAt(0);

        if(operation == '1'){
            double result = a + b;
            System.out.println( a + "+"+ b + "=" + result); // результат вычисления

        } else if(operation == '2'){
            double result = a - b;
            System.out.println( a + "-"+ b + "=" + result);
        } else if(operation == '3'){
            double result = a * b;
            System.out.println( a + "*"+ b + "=" + result);
        } else if(operation == '4') {
            double result = a / b;
            System.out.println(a + "/" + b + "=" + result);


        }
        else{
            System.out.println("Error");
        }
    }
}

