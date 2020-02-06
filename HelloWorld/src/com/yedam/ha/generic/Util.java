package com.yedam.ha.generic;

public class Util {
	public static <T> Box<T> boxing(T t) { //boxing메소드로 사용할 때
		Box<T> box = new Box<>(); //box에 T를 담아서 box클래스는 반환
		box.set(t);
		return box;
	}
}
