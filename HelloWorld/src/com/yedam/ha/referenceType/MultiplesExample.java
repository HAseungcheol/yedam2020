package com.yedam.ha.referenceType;

import java.util.Scanner;

// 2, 3배수 이외의 경우는 기타 
//종료 999입력
public class MultiplesExample {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("숫자를 입력하세요");
			int num1 = scn.nextInt();
			if(num1%2==0) {
				System.out.println("2의 배수 입니다.");
			}else if(num1%3==0 && num1!=999) {
				System.out.println("3의 배수 입니다.");
			}else if(num1%2!=0 && num1%3!=0) {
				System.out.println("기타");
			} else if(num1 == 999) {
				System.out.println("종료");
			}			
			
			}			
	}

}