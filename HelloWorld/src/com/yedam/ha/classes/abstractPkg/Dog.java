package com.yedam.ha.classes.abstractPkg;

public class Dog extends Animal{
	Dog(){  		//생성자 생성
		kind ="포유류";
	}
	
	@Override
	void sound() {
		System.out.println(kind+"멍멍.");
		
	}
	@Override
	void sleep() {
		System.out.println("개 잔다");
	
}
}