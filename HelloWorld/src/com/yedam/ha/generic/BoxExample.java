package com.yedam.ha.generic;

import java.util.ArrayList;
import java.util.List;

import com.yedam.ha.generic.before.Apple;
import com.yedam.ha.interfaces.model.Employees;

public class BoxExample {

	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set("Hello");
	//	box.get(); //반환 리턴값을 주기 위해서
		String str = box.get();
		
		Box<Apple>appleBox = new Box<Apple>();
		appleBox.set(new Apple());
		Apple apple = appleBox.get();
	
		List<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("World");
		for(String str1 : list) {
			System.out.println(str1);
		}
		List<Employees> empList = null;
		
		List<Apple> appleList = new ArrayList<>();
		appleList.add(new Apple());
		
		List ist = new ArrayList();
		ist.add(new Apple());
		ist.add("Hello");
		for(Object obj : ist) {
			System.out.println(obj);
		}
	}

}
