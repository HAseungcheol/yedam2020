package com.yedam.ha.exceptions;

import java.util.Scanner;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = "Hello";
		while (true) {
			System.out.println("숫자입력:");

			try {
				int num = scn.nextInt();
				System.out.println("입력값을확인");
				if (num == 9)
					break;
			} catch (Exception e) {
				System.out.println("입력값을 확인");
			} finally {
				System.out.println("반드시 실행이 되어야 내용.");

//		try {
//			System.out.println(str.toString());
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("숫자입력");
//		try {
//		int num = scn.nextInt();
//		System.out.println("입력하신 값은"+ num);
//		}catch(Exception e) {
//			e.printStackTrace();
//			System.out.println("입력값을 확인");
			}
			try {
				findClass(); //예외처리할 필여 없음.
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("프로그램 종료");

		}
	} //end of main
		static void findClass() throws ClassNotFoundException{
		Class t = Class.forName("Java.lang.String2");
		System.out.println(t.getName());
	}
}
