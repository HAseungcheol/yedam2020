package com.yedam.ha.classes;

import java.util.Scanner;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("사칙연산 부호:+,-,*,/, q:종료");
			String operator = scn.nextLine(); // 입력값 받는 곳
			if (operator.equals("q")) {
				break;
			}
			System.out.println("첫번째 수 입력");
			int num1 = scn.nextInt(); // nextInt 숫자값 받기
			System.out.println("두번째 수 입력");
			int num2 = scn.nextInt();
			Calculator.cal(num1, num2, operator);

		}
		System.out.println("종료");

	}
}
