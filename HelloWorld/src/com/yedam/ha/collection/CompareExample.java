package com.yedam.ha.collection;

import java.util.Arrays;

public class CompareExample {

	public static void main(String[] args) {
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(20);
		if(i1>i2) {
			System.out.println("ture");
			
		}else {
			System.out.println("false");
		}
		String s1 = "hello";
		String s2 = "world";
		String [] sAry = {s1,s2};
		Arrays.parallelSort(sAry);
		for(int i=0; i<sAry.length; i++) {
			System.out.println(sAry[i]);
		}
	}

}
