package patterns;

import java.util.Scanner;

public class NumTriangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();

		for (int i = 0; i < count; i++) {

			for (int j = 0; j < count; j++) {

				if (i == 0 || j < count - i) {
					System.out.print(" " + (j + 1));
				}

			}
			System.out.println();
		}

	}

}
