package com.yedam.ha;
import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("메세지를 입력하세요.");
		System.out.println("종료할려면 q입력>");
		String input ="";
		do {
			System.out.println(">");
			input = scn.nextLine();
			System.out.println("==>"+input);
		 
		} while(!input.equals("q"));
		System.out.println("프로그램 종료.");
//	int i= 1;
//		do {
//			System.out.println(i);
//			i++;
//	} while(i>=5);   //do while 안을 무조건 한번 실행

 }
}

