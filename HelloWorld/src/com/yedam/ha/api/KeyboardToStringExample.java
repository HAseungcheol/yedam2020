package com.yedam.ha.api;

import java.io.IOException;

public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException{
		byte[] bytes = new byte[100];
		
		System.out.println("입력:");
		int readBytNo = System.in.read(bytes);
		
		String str =new String(bytes,0,readBytNo-2);
		System.out.println(str);
	}

}
