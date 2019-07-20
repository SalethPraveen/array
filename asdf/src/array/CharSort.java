package array;

import java.util.Scanner;

public class CharSort {
	char[] sort = new char[40];
	// int [] asc = new int[5];
	int n;

	void getinput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a limit");
		n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter a letters");
			sort[i] = scan.next().charAt(0);
		}
	}

	void check() {
		System.out.println("Acending order is");
		System.out.println("=================");
		for (int i = 0; i <= n; i++) {
			for (int j = i + 1; j < n; j++) {
				// int j = i+1;
				if (sort[i] > sort[j]) {
					char temp = sort[i];
					sort[i] = sort[j];
					sort[j] = temp;
				}

			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(sort[i] + ",");
		}
	}

}
