package classes;

public class StudentArrayExample {

	public static void main(String[] args) {
		Student[] stdAry = new Student[3];
		
		Student sn =new Student("choi",20,180,70);
		
		Student stnt = new Student(); // student 클래스에서stnt값을 인스턴스 하나를 만들어서 stnt값을 담는다.
		stnt.setName("hong"); // 속성
		stnt.setAge(20); 
//		stnt.setAge(20);
		stnt.setHeight(170);
		stnt.setWeight(70);
		
		Student snt = new Student();
		snt.setName("park"); 
//		snt.age = 25;
		snt.setAge(-25); //잘못된 값입력 하면 0
		snt.setHeight(190); 
		snt.setWeight(75);

		stdAry[0] = sn;
		stdAry[1] = snt;  //원래는 stnt
		stdAry[2] = stnt;		//snt
		//순서 바꿔서 넣기
		stdAry[0] = stdAry[1];
		stdAry[1] = stdAry[2];
		stdAry[2] = stdAry[0];
		
		
		
		for(int i=0; i<stdAry.length; i++) {
			if(stdAry[i].getName().equals("choi")) //문자열 equals 사용하기 
			System.out.println(stdAry[i].name+" "+stdAry[i].getage());
		}
		
		
	}

}
