package com.yedam.ha.interfaces;

public class MorningCode {

	public static void main(String[] args) {
		String result = getDigiNumber(37);
		System.out.println(result);
	}
	static String getDigiNumber(int num) {
		String result = " ";  //String 나온 값을 다 보여 주고 싶어서 int 안씀
		int num2 =0; //몫
		int num1 =num; //나머지 
		while(true) {
			num2 = num1 % 2;
			result = num2+result;
			num1=num1 /2;
			if(num1==0)
				break;
		}
		return result;
	}
	
}
//num1 37을 담고 num2가 2로 나눈 값을 표현 