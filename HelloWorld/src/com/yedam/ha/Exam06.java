package com.yedam.ha;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		Student[] stu = new Student[5];
		int input;
		Scanner scn = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println("================");
			System.out.println(" 1.등록 2.조회 3.리스트 4.수정 5.종료");
			System.out.println("================");
			System.out.println("선택>");
			input = scn.nextInt();

			if (input == 1) {
				System.out.println("이름입력");
				String name = scn.nextLine();
				System.out.println("학번입력");
				int i = scn.nextInt();
				System.out.println("영어점수");
				int eng = scn.nextInt();
				System.out.println("수학점수");
				int mat = scn.nextInt();
				scn.nextLine();

			} else if (input == 2) {
				System.out.println("출력할 학번 입력");
				int i = scn.nextInt();
				scn.nextLine();
				stu[i].showInfo();
				System.out.println("\n");

			} else if (input == 3) {

			} else if (input == 4) {

			}
		}

	}
}