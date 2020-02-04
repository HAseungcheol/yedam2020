package com.yedam.ha.interfaces;

public interface RemoteControl {
 //(상수)필드
	public static final int MAX_VOLUME =10; //final 한번선언한 값은 못바꾼다
	int MIN_VOLUME =0;
	//생성자(X)
	//(추상)메소드
	public abstract void turnOn();
	public void turnOff();
}
