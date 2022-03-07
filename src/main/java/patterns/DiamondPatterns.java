package patterns;

import java.util.Scanner;

public class DiamondPatterns {

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
				System.out.print("" + j);
				starCount = starCount + 1;
			}
			System.out.println("");
		}

		int midCount = 0;

		for (int i = 1; i < n; i++) {
			starCount = starCount - 2;
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}

			midCount = i;
			for (int j = 1; j <= starCount; j++) {
				if (j == (starCount / 2 + 1)) {
					System.out.print(midCount - 1);
					midCount--;

				} else {
					System.out.print("" + j);
					midCount++;
				}

			}
			System.out.println("");
		}

	}

}
