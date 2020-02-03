package com.yedam.ha.classes.extendPkg;

public class DriverExample {

	public static void main(String[] args) {
		Driver d1 =new Driver();
		Vehicle vehicle = new  Vehicle(); 
		d1.drive(vehicle); 			//실행
		vehicle = new Bus();		//promotion(자동 형 변환)
		d1.drive(vehicle);			//실행
		vehicle = new Truck();		//promotion
		d1.drive(vehicle);			//실행

	}

}
