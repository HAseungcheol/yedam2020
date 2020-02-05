package com.yedam.ha.api;

public class MemberExample {

	public static void main(String[] args) {
	Member m1 = new Member();
	m1.name = "park";
	m1.age =10;
	
	Member m2 = new Member();
	m2.name="kim";
	m2.age = 10;
	
	String str1 = "Hello";
	String str2 ="Hello";
	
	System.out.println(str1.equals(str2));
		
	System.out.println(m1.equals(m2));  //equals 사용이유가member클래스에서 기본적으로 object 포함이라서 사용해줌
		System.out.println(m1.hashCode());
	}

}
