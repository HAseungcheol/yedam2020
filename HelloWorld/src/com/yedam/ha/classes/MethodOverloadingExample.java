package com.yedam.ha.classes;
//메소드 오버로딩 : 동일한 메소드 사용.
public class MethodOverloadingExample {

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1);
		
		
		int num1=10, num2=20;
		double d1=1.5, d2=2.3;
		print(sum(d1,d2));  //double 받아서 실행할 수 있도록 메소드 정의해줘야함
		print(sum(num1, num2));  //int 메소드 받음

	}
	static void print() {      //print 그냥값이 나오게 할려고 빈값 메소드 정의해줌
		System.out.println();
	}
	
	static void print(double d) {
		System.out.println(d);
	}
	
	
	static void print(String str) {  
		System.out.println(str);
	}
	
	static void print(int str) {
		System.out.println(str);
	}
	
	static int sum(int a, int b) {  //메소드의 매개변수 갯수를 다르게 하면 sum 사용 가능, 타입다르게 해서 sum사용가능
		return a+b;
	}
	
	static int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	static double sum(double a, double b) {
		return (double) a+b;
		
	}
}
