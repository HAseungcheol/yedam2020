package com.yedam.ha.classes.extendPkg;

public class ExtendExample {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.field1 ="parent";
		p1.method();
		
		Child c1 = new Child();
		c1.field1="Parent";
		c1.field2="child";
		c1.method();
		c1.method2();

	}

}
