package com.yedam.ha.classes.extendPkg;

public class Parent {
	String field1;
	void method() {
		System.out.println("부모클래스의 메소드1");
	
	}
	@Override //소스에 투 스트리어링
	public String toString() {
		return "Parent [field1=" + field1 + "]";
	}
	
}
