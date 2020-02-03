package com.yedam.ha.classes.extendPkg;

public class Car {
//	Tire frontLeft = new Tire("앞왼쪽", 6);
//	Tire frontRight = new Tire("앞오른쪽", 8);
//	Tire backLeft = new Tire("뒤왼쪽", 4);
//	Tire backRight = new Tire("뒤오른쪽", 10);
	Tire[] tires = {new Tire("앞왼쪽",6),
					new Tire("앞오른쪽",8),
					new Tire("뒤왼쪽",4),
					new Tire("뒤오른쪽",10)};
	
	int run() {
		if (tires[0].roll() == false) { // false 빵구
			System.out.println("자동차가 멈춥니다");
			return 1;  //앞왼쪽 빵구나면 1이 나오도록
		}
		if (tires[1].roll() == false) { 
			System.out.println("자동차가 멈춥니다");
			return 2;
		}
		if (tires[2].roll() == false) { 
			System.out.println("자동차가 멈춥니다");
			return 3;
		}
		if (tires[3].roll() == false) { 
			stop();
			return 4;
		}
		return 0;  //빵구 안남
	}
	void stop() {
		System.out.println("자동차가 멈춥니다");
	}
}
