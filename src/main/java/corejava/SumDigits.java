package corejava;

import java.util.Scanner;

public class SumDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("no of inputs");
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {

            System.out.println("enter num");
            int num = sc.nextInt();
            int sum =0;
            while (num > 0) {

                int rem=  num % 10;
                sum = sum + rem;
                num = num / 10;

            }

            System.out.println("sum is: " + sum);
        }

    }

}
