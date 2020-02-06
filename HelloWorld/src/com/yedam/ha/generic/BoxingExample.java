package com.yedam.ha.generic;

public class BoxingExample {

	public static void main(String[] args) {
//		Util.boxing(new Integer(10)) //boxing(T t)를 여기서 변수 선언
		Box<Integer> box = Util.boxing(new Integer(10));
		Integer i = box.get();
		System.out.println(i);
	}

}
