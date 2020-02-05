package com.yedam.ha.api;

public class StringEqualExample {

	public static void main(String[] args) {
		String strVar1 = new String("신철민");
		String strVar2 ="신철민";
		
		if(strVar1 == strVar2) {
			System.out.println("같은 String 객체를참조");
		}else {
			System.out.println("다른 String 객체를 참조");
		}
		if(strVar1.contentEquals(strVar2)) {
			System.out.println("같은 String 문자열을 가짐");
		}else {
			System.out.println("다른 문자열을 가짐");
		}
	}

}
