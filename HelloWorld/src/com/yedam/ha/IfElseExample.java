package com.yedam.ha;

public class IfElseExample {
	public static void main(String[] args) {
		int result = 80;
		if (result >= 90) {
			System.out.println("A학점");
		} else if (result > 80) {
			System.out.println("b학점");
		} else if (result > 70) {
			System.out.println("c학점");
		} else {
			System.out.println("F학점");
		}

		int result1 = 80;
		if (result1 >= 90) {
			if (result1 >= 95) {
				System.out.println("A+학점");
			} else {
				System.out.println("A학점");
			}
		} else if (result1 >= 80) {
			System.out.println("B학점");
		} else if (result1 > 70) {
			System.out.println("c학점");
		} else {
			System.out.println("F학점");
		}

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
			System.out.println("1~100까지 합:" + sum);
		}

		int sum1 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum1 = sum1 + i;
				System.out.println("1~100까지 합:" + sum1);
			}
		}
		int var1 = 3, var2=0;
		for(int i= 1; i<10; i++) {
			var2 = var1*i;
			System.out.println(var1+"*"+i+"=" +var2);
		}
	}
}

















