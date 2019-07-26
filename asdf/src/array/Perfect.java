package array;

import java.util.Scanner;

public class Perfect {
	private int[] in = new int[5];
	private int[] result = new int[5];
	private int[] temp = new int[5];

	public void input() {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter a numbers");
			in[i] = scan.nextInt();
			temp[i]=in[i];
		}
	}

	public void check() {

		for (int i = 0; i <5; i++) {
			// int re=1;
			for (int j = 1; j < in[i]; j++) {
				if (in[i] % j == 0) {
					result[i] = result[i] + j;
				}
				// result[i]=re;
			}
			System.out.println("the factorial value is" + result[i]);
		}
	
		for (int l = 0; l < 5; l++) {
			if (temp[l] == result[l]) {
				System.out.println("its perfect " + temp[l]);
			} else {
				System.out.println("not perfect " + temp[l]);
			}
		}

}
}