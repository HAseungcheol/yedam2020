package common;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0;
		int[] b = new int[100];
		int c = 0;

		System.out.println("값을 입력하시오. ");
		Scanner scn = new Scanner(System.in); // 문자열입력받고
		int num = scn.nextInt();

		for (int i = 0; i <= 100; i++) {
			b[i] = num % 2;
			num = num / 2;
			if (num == 1) {
				a = 1;
				c = i;
				break;
			}
		}

		System.out.print(a);
		for (int i = c; i > 0; i--) {
			System.out.print(b[i]);
		}
	}

}
