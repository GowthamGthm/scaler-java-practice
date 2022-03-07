package corejava;

import java.util.Iterator;
import java.util.Scanner;

public class BankBalance {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("input initial balance");
        int balance = sc.nextInt();

        System.out.println("no of inputs");
        int noOfInputs = sc.nextInt();

        for (int i = 1; i <= noOfInputs; i++) {

            System.out.println("input ur choice");
            int choice = sc.nextInt();
            
            System.out.println("input ur transaction amount");
            int tranAmt = sc.nextInt();

            if (choice == 1) {
                balance = tranAmt + balance;
                System.out.println("balance after deposit: " + balance);
            } else {
                if (tranAmt > balance) {
                    System.out.println("insufficient funds");
                } else {
                    balance = balance - tranAmt;
                    System.out.println("balance after withdrawal: " + balance);
                }
            }

        }

    }

}
