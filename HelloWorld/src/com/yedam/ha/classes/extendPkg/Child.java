package com.yedam.ha.classes.extendPkg;

public class Child extends Parent{
	String field2;
	void method2() {
		System.out.println("자식클래스의 메소드2");
	
	}
	
	@Override//부모클래스에서 자식 클래스로 가져오지만 재정의 가능
	void method() {		
		super.method(); //이건 부모 클래스 바로 가져옴(재정의 안함)
		System.out.println("자식클래스의 메소드1");
	}

	@Override 
	public String toString() {
		return "Child [field2=" + field2 + "]";
	}
}
