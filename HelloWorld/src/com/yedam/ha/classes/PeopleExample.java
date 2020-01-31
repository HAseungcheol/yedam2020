package com.yedam.ha.classes;

public class PeopleExample {
	public static void main(String[] args) {
		People ppa =new People("chei",25,180,75,"busan");
		System.out.println(ppa.name);
		System.out.println(ppa.age);
		System.out.println(ppa.height);
		System.out.println(ppa.weight);
		System.out.println(ppa.address);
				
		
		People ppe =new People();
		ppe.name="hoho";
		ppe.age=25;
		ppe.weight=75;
		ppe.height=180;
		System.out.println(ppe.name);
		System.out.println(ppe.age);
		System.out.println(ppe.height);
		System.out.println(ppe.weight);
		
		ppe.sleep();
		ppe.eat();
		System.out.println(ppe.getage());
	}
	
}
