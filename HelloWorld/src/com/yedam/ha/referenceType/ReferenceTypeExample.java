package com.yedam.ha.referenceType;

public class ReferenceTypeExample {

	public static void main(String[] args) {
		int num1 =10;
		String str = new String("Hello");
		String str1 = new String("Hello");
		System.out.println(str1);  // string이 주소 값을 가지고있는데 서로 다른 주소값이라서 False
		
	}

}
