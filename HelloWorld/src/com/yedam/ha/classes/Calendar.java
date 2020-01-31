package com.yedam.ha.classes;
//월 입력하면 해당월의 날짜를 반환해주는 메소드.

//1월 31, 2월28일 3월31일
//	static return값  getMonthDay(매개값) {

public class Calendar {
	public static void main(String[] args) {
		
		createCal(5);
}
		static void createCal(int month) {					
		String[] day = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		int days = getMonthDay(month);
		int firstDay = getFirstDay(month);
		System.out.println(month + "월은" + getMonthDay(month)); // 월 출력

		for (int i = 0; i < day.length; i++) {
			System.out.print(" " + day[i]);
		}
		System.out.println();
		// 7월의 첫째날의 시작위치 지정
		for (int i = 0; i < firstDay - 1; i++) {
			System.out.print("    ");
		}

		for (int i = 1; i <= days; i++) {
			System.out.printf("%4d", i); // 앞에 시작 3칸띄어쓰기, printf 사용
			if ((firstDay - 1 + i) % 7 == 0) // 7일씩 출력 후 다음칸으로
				System.out.println();
		}
	}
	// 2020년 1,2,3,4월에 해당하는 첫째날의 요일
	// 일=>1, 월=>2, 화=>3....토=>7
	static int getFirstDay(int month) {
		if (month == 1) { // 1월달은 수요일
			return 4;
		} else if (month == 2) { // 2달은 토요일
			return 7;
		} else if (month == 3) { // 3월달은 일요일
			return 1;
		} else if (month == 4) { // 4월달은수요일
			return 4;
		} else if (month == 5) {
			 return 6;
		}else { // 그외의 달은 없다.
			return 0;
		}
	}

	static int getMonthDay(int month) {
		int days = 0;
		if (month <= 7 && month % 2 == 1) {
			days = 31;
		} else if (month > 7 && month % 2 == 0) {
			days = 31;
		} else if (month == 2) {
			days = 28;
		} else {
			days = 30;
		}
		return days;

	}
}