package com.yedam.ha.classes.extendPkg;

public class Truck extends Vehicle {
	@Override // 재정의
	void run() {
		System.out.println("트럭이 달립니다");

	}
}