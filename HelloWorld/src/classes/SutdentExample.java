package classes;

public class SutdentExample {

	public static void main(String[] args) {
		Student sn =new Student("choi",20,180,70); //초기화값으로 만들어두면 한번에 입력가능
		System.out.println(sn.name);
		System.out.println(sn.age);
		System.out.println(sn.height);
		System.out.println(sn.weight);
		
		Student stnt = new Student(); // student 클래스에서stnt값을 인스턴스 하나를 만들어서 stnt값을 담는다.
		stnt.name = "hong"; // 속성
		stnt.age = 20;
		stnt.height = 170;
		stnt.weight = 65;
		System.out.println(stnt.name);
		System.out.println(stnt.age);
		System.out.println(stnt.height);
		System.out.println(stnt.weight);
		stnt.study(); // 메소드(동작)
		stnt.eat();
		System.out.println(stnt.getage());
		

		Student snt = new Student();
		snt.name = "park";
		snt.age = 25;
		snt.height = 190;
		snt.weight = 75;
		System.out.println(snt.name);
		System.out.println(snt.age);
		System.out.println(snt.height);
		System.out.println(snt.weight);
		snt.study();
		System.out.println(snt.getage());
	}

}
