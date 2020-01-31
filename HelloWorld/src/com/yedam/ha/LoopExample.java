package com.yedam.ha;

public class LoopExample {

	public static void main(String[] args) {
		// 1~100 수중에서 3의 배수이면서 7의 배수 출력

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 7 == 0)

				System.out.println("3의배수 이면서 7의 배수" + i);
		}
		// while
		int a = 1;
		while (a <= 100) {
			if (a % 3 == 0 && a % 7 == 0)
				System.out.println("3의배수7의배수"+a);
			a++;
		}

	}
}
