package com.yedam.ha.referenceType;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run =true;
		int studentNum = 0; //학생수 넣기 위해서 
		int[] scores =null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) { //무한반복 시켜서 질문나오게  구문 제일 마지막에 false해서 구문 그만 나오게함
			System.out.println("===================");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("===================");
			System.out.println("선택>");
		int selectNo = scanner.nextInt();
		
		if(selectNo==1) {
			System.out.println("학생수>");
			studentNum = scanner.nextInt(); //사용자가 숫자 입력하게 하기 위해서 scanner.nextInt()사용
			scores= new int[studentNum];
		}
		else if(selectNo==2) {
			for(int i=0; i<scores.length; i++) {
				System.out.println("scores["+i+"]>");
				int score=scanner.nextInt();
				scores[i]=score;
			}	
		}
		else if(selectNo==3) {
			for(int i=0; i<studentNum; i++) {
				System.out.println("scores["+i+"]:"+scores[i]);
			}
		}
		else if(selectNo==4) {
			int max=0;
			int sum=0;
			double avg =0;
			for(int i=0; i<studentNum; i++) {
				sum+=scores[i];
				if(scores[i]>max)
					max=scores[i];
			}
			avg=(double)sum/studentNum;
			System.out.println("최고점수:"+max);
			System.out.println("평균점수:"+avg);
		}
		else if(selectNo==5) {
			run=false;
			System.out.println("프로그램 종료");
		}
		
		}
		

	}

}
