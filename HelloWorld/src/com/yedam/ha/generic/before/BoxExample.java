package com.yedam.ha.generic.before;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		box.set(new String("Hello"));
		String str = (String) box.get();
		
		Apple apple = new Apple();
		
		box.set("apple");
//		Apple apple2 = (Apple) box.get(); //행 변환 해줘야한다 (Apple)
		String str2 = (String) box.get();
	}
}
