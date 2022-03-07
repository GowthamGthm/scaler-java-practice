package patterns;

import java.util.Scanner;

public class NumberDIamond {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int starCount = 0;

		for (int i = 1; i <= n; i++) {

			starCount = 0;
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
				starCount = starCount + 1;
			}
			System.out.println("");
		}

		for (int i = 1; i < n; i++) {
			starCount = starCount -2 ;
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= starCount; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
