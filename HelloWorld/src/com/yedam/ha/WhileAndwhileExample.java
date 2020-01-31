package com.yedam.ha;

public class WhileAndwhileExample {

	public static void main(String[] args) {
		// while 사용해서 구구단 출력
		int i = 1, j = 1;
		while (i <= 9) {
			while (j < 9) {
				System.out.print(j+1 + " X " + i + " = " + (i * j)+"  ");
				j++;
			}
			j=1;
			i++;
			System.out.println();
		}
		
	}

}
