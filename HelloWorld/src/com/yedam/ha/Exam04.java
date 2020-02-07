package com.yedam.ha;

public class Exam04 {
	   public static void main(String[] args) {
		      int sum = 0;
		      for (int i = 0; i <= 100; i++) {
		         if (i % 2 == 0 || i % 3 == 0) {
		            sum = sum + i;
		         }
		      }
		      System.out.println("2의 배수 또는 3의 배수의 합: " + sum);
		   }
		}