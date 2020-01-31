package com.yedam.ha;

public class ForArrayExample {

	public static void main(String[] args) {
		// 1) 배열크기가 100인 배열 intAry(1~100값을 담아주세요)
		// 2)배열의 홀수번째 위치에 있는 값을 합하는 for구문.
		int[] intAry = new int[100];
		for (int i = 0; i <= 99; i++) {
			intAry[i] = i + 1;
			System.out.println(intAry[i]);
		}
		int sum = 0;
		for (int i = 0; i <= 99; i++) {
			if (i % 2 == 1) {
				sum = sum + intAry[i];
			}

		}
		System.out.println(sum);
	}

}
