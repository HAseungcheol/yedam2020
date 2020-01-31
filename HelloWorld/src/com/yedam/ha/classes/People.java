package com.yedam.ha.classes;

public class People {
	//필드
	String name;
	String address;
	int age;
	int height;
	int weight;
	
	People(){
	}
	
	People(String name, int age, int height, int weight, String address){
		this.name=name;
		this.age = age;
		this.height=height;
		this.weight=weight;
		this.address=address;
	}
	
	//메소드
	void eat() {
		System.out.println("밥을 먹는다");
	}
	void sleep() {
		System.out.println("잠을 잔다");
	}
	int getage() {
		return age;
	}

}
