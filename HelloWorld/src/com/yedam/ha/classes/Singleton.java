package com.yedam.ha.classes;

public class Singleton {
	private static Singleton s1 = new Singleton(); //생성자를 만들어서 호출할수 있는데 
								
	private Singleton() {						//private로 막아서 다른 클래스에서 사용 못한다 사용 할려면
												//Singleton s1 = Singleton.getInstance();
	}
	static Singleton getInstance(){
		return s1;
	}
}
