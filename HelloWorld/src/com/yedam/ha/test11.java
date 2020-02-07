package com.yedam.ha;

import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		boolean run = true;
		int a = 0;
		double payment=0;
		Scanner scn = new Scanner(System.in);
		while(run) {
			System.out.println("==================");
			System.out.println("1.사용 kwh 금액확인 2.총 금액확인 3.종료");
			int menu = scn.nextInt();
			if(menu==1) {
				System.out.println("0~100kwh는 100원, 101~200kwh는 150원,201~300kwh는 230원,301~kwh는 300원 ");
				int input = scn.nextInt();
				a=a+input;
			}else if(menu==2) {
				System.out.println("사용량은");
				int input = scn.nextInt();
				payment =100+a*100;
			}else if(menu==3){
				run =false;
			}
		}

	}

}
