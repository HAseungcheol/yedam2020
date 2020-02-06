package com.yedam.ha.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Student{
	int stdNO;
	String name;
	public Student(int stdNO, String name) {
		super();
		this.stdNO = stdNO;
		this.name = name;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.stdNO;
	}
	@Override
	public boolean equals(Object obj) {
		Student s1 = (Student) obj;
		return this.name.contentEquals(s1.name);
	}
	
}
public class HashMapExample2 {

	public static void main(String[] args) {
		Map<Student, Integer> map= new HashMap<>();
		map.put(new Student(111,"이다혜"),30);
		map.put(new Student(111,"신아라"),40);
		map.put(new Student(111,"이지원"),50);
		map.put(new Student(111,"이다혜"),60);
		System.out.println(map.size());  //오라이드 재정의 하기전에는 4, 한 후 3
		Set<Student> set=map.keySet();  //key 있는 값만 가지고 온다
		Iterator<Student>iter=set.iterator();
		while(iter.hasNext()) {
			Student key = iter.next();
			System.out.println(key.name+","+key.stdNO+","+map.get(key));
		}
	}

}
