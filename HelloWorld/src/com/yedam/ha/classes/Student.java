package com.yedam.ha.classes;

public class Student {

		//필드
		String name;
	private	int age;
	private	int height;
	private	int weight;
		//생성자(인스턴스를 만들면서 필드값을 초기화) new Student
		public Student() {  //초기값 사용시 빈 폴더를 하나 만들어라  //pubilc 쓰면 다은 클래스 패키지 클래스에서 공유해서 사용 가능
		}
		
		public Student(String name){
			this.name=name; //필드의 값을 초기값으로 만들어서 사용하겠다.
		}
		Student(String name, int age, int height, int weight){
			this.name = name;
			this.age = age;
			this.height=height;
			this.weight=weight;
		}
		
		
		//메소드
		public void study() {
			System.out.println("공부한다.");
		}
		public void eat() {
			System.out.println("밥을 먹는다.");
		}
		public void sleep() {
			System.out.println("잠을 잔다.");
		}
		void setAge(int age) {
			if(age>=0)
				this.age=age;
			else
				this.age=0;
		}
		int getage() {
			return age; //값을 반환
		}

		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getHeight() {
			return height;
		}

		public void setHeight(int height) {
			this.height = height;
		}

		public int getWeight() {
			return weight;
		}

		public void setWeight(int weight) {
			this.weight = weight;
		}

		public int getAge() {
			return age;
		}
}
