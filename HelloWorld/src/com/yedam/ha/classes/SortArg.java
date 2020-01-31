package com.yedam.ha.classes;

public class SortArg {

	public static void main(String[] args) {
		int[] ary = { 15, 13, 20, 25, 7, 17 };
		int sum = 0;
		for (int i = 0; i < ary.length; i++) {
			for (int j = i + 1; j < ary.length; j++) {
				if (ary[i] > ary[j]) {
					sum = ary[i];
					ary[i] = ary[j];
					ary[j] = sum;
					
				}

			}

		}
		System.out.println("오름차순");
		for (int a = 0; a < ary.length; a++) {
			System.out.print(ary[a] + " ");
		}
		System.out.println();
		int[] ary1 = { 15, 13, 20, 25, 7, 17 };
		int sum1 = 0;
		for (int i = 0; i < ary.length; i++) {
			for (int j = i + 1; j < ary.length; j++) {
				if (ary[i] < ary[j]) {
					sum = ary[i];
					ary[i] = ary[j];
					ary[j] = sum;

				}
			}
		}
		System.out.println("내림차순");
		for (int a = 0; a < ary.length; a++) {
			System.out.print(ary[a] + " ");
	}
	
}
}