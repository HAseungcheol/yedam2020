package com.yedam.ha;

public class WhileExample {

	public static void main(String[] args) {
//		int i = 0;
//		while(true) {  //true 무한반복을 시킬때 사용하는데 break 사용해 멈춤
//			i = (int)(Math.random()*6)+1;
//			System.out.println(i); //무한반복으로 6이 나올때까지 돌리겠다.
//				if( i==6) {
//				break;
//			}
	
		//1~100 수중에 짝수의 합을 구하는 whiile
//		int sum =0;
//		int i=1;
//		while(i<=100) {
//			i++;
//			if(i%2==0) {
//				sum =sum +i;
//			}
//			System.out.println("합계는"+sum);
//		} 
		// 구구단 5단을 출력하는 프로그램(while)
		int i=5, j=0;
		 while( i == 5 ) {
	            
	         if(j == 9) {
	                i++;
	            } else {
	                j++;
	                System.out.println(i + " X " + j  + " = " + (i * j));
 }
		 }
}
}	