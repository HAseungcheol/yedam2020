package com.yedam.ha.classes.extendPkg;

public class Cellphone {
	private String model;
	private String color;
	
	public Cellphone() {
		
	}
	public Cellphone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
	void powerOn() {
		System.out.println("전원을 켭니다");
	}
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
	void bell() {
		System.out.println("벨이 울립니다");
	}
	void sendMessage(String message) {
		System.out.println("자신:"+message);
	}
	void receiveMessage(String message) {
		System.out.println("상대방:"+message);
	}
	void hangUp() {
		System.out.println("종료합니다");
	}
}
