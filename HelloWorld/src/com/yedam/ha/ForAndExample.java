package com.yedam.ha;

public class ForAndExample {
public static void main(String[] args) {
 	int cnt=0;
	for (int i = 2; i<=9; i++) {
		for(int j=1; j<=9; j++) {
			cnt++;
			System.out.print(i+"*"+j+"="+(i*j)+"   "); //첫번째 for안에 두번째 for이 9번 출력되고 다시 위로 올라간다
		}
		cnt=0;
		System.out.println();	
	}
	cnt=0;
}
}
