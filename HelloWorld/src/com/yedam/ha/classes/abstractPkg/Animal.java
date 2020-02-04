package com.yedam.ha.classes.abstractPkg;

public abstract class Animal {
	String kind;
	//기본 생성자 존재.
	
	//메소드
	void breathe() {
		System.out.println("숨을 쉽니다");
	}
	//추상메소드
	abstract void sound();
	abstract void sleep();
}
