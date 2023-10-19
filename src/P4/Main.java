package P4;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Input a number");
        int num = scanner.nextInt();

        System.out.printf("Your number: %d \n", num);
        scanner.close();

    }
}
