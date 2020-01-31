package com.yedam.ha.classes;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.print("년 입력 0:종료 >");
			int year = scn.nextInt();
			if (year == 0) {
				break;
			}
			System.out.print("월 입력>");
			int month = scn.nextInt();
			createCal(year, month);
		}
		System.out.println("프로그램 종료.");
		scn.close();
	}

	static void createCal(int year, int mon) {
		Calendar cal = Calendar.getInstance();// Calendar클래스의 instance선언.
		cal.set(year, mon - 1, 1);
		cal.get(Calendar.DAY_OF_WEEK); // 해당날짜의 요일정보.
		cal.getActualMaximum(Calendar.DAY_OF_MONTH);// 해당월의 마지막날짜

		System.out.println("======================");
		System.out.println("   <<<" + year + "년 " + mon + "월>>>");
		int month = mon;
		String[] day = { "일", "월", "화", "수", "목", "금", "토" };
		int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int firstDay = cal.get(Calendar.DAY_OF_WEEK);
		// 요일 출력.
		for (int i = 0; i < day.length; i++) {
			System.out.print("  " + day[i]);
		}
		System.out.println();
		// 월의 첫째날의 시작위치 지정.
		for (int i = 0; i < firstDay - 1; i++) {
			System.out.print("   ");
		}
		// 7일씩 잘라서 출력.
		for (int i = 1; i <= days; i++) {
			System.out.printf("%3d", i);
			if ((firstDay - 1 + i) % 7 == 0)
				System.out.println();
		}
		System.out.println();
		System.out.println("======================");
	}



	

//	public static void main(String[] args) {
//		int year, month;
//		year = 2020;
//		month = 2;
//
//		Calendar ca1 = Calendar.getInstance();
//		System.out.println("현재년도:" + ca1.get(Calendar.YEAR));
//		System.out.println("현재 month:" + ca1.get(Calendar.MONTH));
//		System.out.println("현재day:" + ca1.get(Calendar.DAY_OF_WEEK_IN_MONTH));
//		System.out.println("요일:" + ca1.get(Calendar.DAY_OF_WEEK));
//
//		ca1.set(2020, 0, 1); // 현재 날짜 세팅
//		System.out.println("현재년도:" + ca1.get(Calendar.YEAR));
//		System.out.println("현재 month:" + ca1.get(Calendar.MONTH));
//		System.out.println("현재day:" + ca1.get(Calendar.DAY_OF_WEEK_IN_MONTH));
//		System.out.println("요일:" + ca1.get(Calendar.DAY_OF_WEEK));
//		System.out.println("전체일수:" + ca1.getActualMaximum(Calendar.DAY_OF_MONTH));
//	}


}
