package patterns;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();

		for (int i = 1; i <= count; i++) {

			for (int j = 1; j <= count; j++) {

				if (i == 1 || j == 1 || (i + j == count + 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
	}

}
