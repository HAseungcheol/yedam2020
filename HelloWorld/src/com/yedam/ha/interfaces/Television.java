package com.yedam.ha.interfaces;

public class Television implements RemoteControl{
	private int volume; //필드
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
		
	}

	@Override
	public void turnOff() {
	System.out.println("TV를 끕니다");
		
	}

}
