package corejava;

import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tableNumber = sc.nextInt();

        int i = 1;

        while (i <= 10) {

            int value = tableNumber * i;
            System.out.println("" + tableNumber + " X " + i + " = " + value);

            i++;
        }

    }

}
