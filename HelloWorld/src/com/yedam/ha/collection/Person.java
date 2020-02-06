package com.yedam.ha.collection;

public class Person implements Comparable<Person>{
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
	//	return this.name.compareTo(o.name); //가나다 순으로 정렬 ,age - o.age 작은값의 나이순
		return this.name.length()-(o.name.length()); //글자수 작은거 부터 출력
	}
	
}
