package com.yedam.ha.generic.before;

public class Box {
	private Object obj; //object는 어떤 값을 다 받는다.
	public void set(Object obj) {
		this.obj=obj;
	
	}
	public Object get() {
		return obj;
	}
}
