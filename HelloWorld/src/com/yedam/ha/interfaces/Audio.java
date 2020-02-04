package com.yedam.ha.interfaces;

public class Audio implements RemoteControl {
	private int volum;
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다");
		
	}

}
