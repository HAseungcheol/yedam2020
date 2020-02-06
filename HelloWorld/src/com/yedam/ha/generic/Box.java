package com.yedam.ha.generic;

public class Box<T> {  //<T> 타입을 정하겠다는 뜻
	private T obj;
	public void set(T obj) {
		this.obj = obj;
	}
	public T get() {
		return obj;
	}
}
