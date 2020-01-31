package com.yedam.ha.referenceType;

import java.util.Scanner;

public class Exercise10 {  //필드
	static	boolean run = true;  //boolean 참 거짓 설정 변수(논리데이터 타입)
	static	int studentNum = 0;  //학생수에서 사용
	static	int[] scores = null; //점수리스트
	static Scanner scn = new Scanner(System.in); //점수 입력값 받기위해서
	
	public static void inputStudents() {
		System.out.print("학생수>");
		studentNum = scn.nextInt();
		scores = new int[studentNum];
	}
	
	public static void inputScores() {
		for (int i = 0; i < scores.length; i++) {
			System.out.print("scores[" + i + "]>");
			int score = scn.nextInt();
			scores[i] = score;
	}
	}
	public static void scoreList() {
		for (int i = 0; i < scores.length; i++) {
			System.out.print("scores[" + i + "]>: " + scores[i]);
	}
	}
	public static void analysisScores() {
		int max = 0;
		int sum = 0, cnt = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
			cnt++;
			if (max < scores[i]) {
				max = scores[i];
			}
		}
		System.out.println("최고점수: " + max);
		System.out.println("평균점수: " + ((double) sum / cnt));
	}
	public static void showMenu() {
		System.out.println("-------------------------");
		System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
		System.out.println("-------------------------");
	}
	public static void main(String[] args) {
		

		while (run) {
			showMenu();
			System.out.print("선택>");
			
			int selectNo = scn.nextInt();
			if (selectNo == 1) {
				inputStudents();
				
			} else if (selectNo == 2) {
				scoreList();
				
				
			} else if (selectNo == 3) {
				scoreList();
				
				
			} else if (selectNo == 4) {
				analysisScores();
			
			} else if (selectNo == 5) {
				run = false;
			}
		} // end of while
		System.out.println("프로그램 종료.");
	}
}
