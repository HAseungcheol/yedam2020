package com.yedam.ha.classes;

public class MethodExample {
public static void main(String[] args) {
	Method m =new Method();  //m 인스턴스를 만들어서 처리
	m.setLeftField(30);
	m.setRightField(4);
	m.setLeftField(100);
	int result = m.thisSum() + m.thisMinus();
	int result2 = m.sum(20, 10) * m.minus(30, 25); //매개변수로 받음
	System.out.println("필드의 합:"+result);
	System.out.println("두매개값의 계산결과:"+result2);
}
}
