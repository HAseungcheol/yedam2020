package com.yedam.ha.generic;
class Television{
	
}
public class ProductExample {

	public static void main(String[] args) {
		Product<Television, String> p1 = new Product<>();
		Television t1 = new Television();
		p1.setKind(t1);
		p1.setModel("smartTV");
		Television tell = p1.getKind();		// Product 클래스에서 선언하고 그걸 이요 하기 때문에
		String str1 = p1.getModel();   		//T는 Television M은 String 타입만 올 수 있다.
										
	}

}
