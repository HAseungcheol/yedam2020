package com.yedam.ha;

import java.util.Scanner;

public class test12 {

	public static void main(String[] args) {
		int kw =250;
		int sum =0;
		Scanner scn = new Scanner(System.in);
		for(int i=0; i<=kw; i++) {
			if(i<=100) {
				sum += 100;							
			}else if (i>100 && i<=200)
				sum+=150;
			else if(i>200 && i<=300)
				sum= sum+230;
			else sum+=300;
			
				
		}

		System.out.println(sum + "원");

	}
}
