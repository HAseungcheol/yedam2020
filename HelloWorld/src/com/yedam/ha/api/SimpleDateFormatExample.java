package com.yedam.ha.api;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.yedam.ha.classes.SutdentExample;

public class SimpleDateFormatExample {

	public static void main(String[] args) {
		Date  now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		System.out.println(sdf.format(now));

		sdf = new SimpleDateFormat("오늘은 E요일");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("올해의 D 번째 날");
		System.out.println(sdf.format(now));
	
		sdf = new SimpleDateFormat("이달의 d번째 날");
		System.out.println(sdf.format(now));
	}

}