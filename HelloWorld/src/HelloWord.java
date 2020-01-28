
public class HelloWord {
	public static void main(String[] args) {
		int age = 28;
		int year = 2020; //int(타입) 사용하고 변수 선언
		System.out.println("Hello, welcome to the java world!");
		System.out.println("올해는" + year);
		System.out.println("내 나이는"+ age);
		System.out.println(year+age);

		int height = 170; //(여기는 정수만 넣을 수 있다)
		int weight = 65;
		long heigh = 170000000L; //롱 타입으로 사용 하는 방법
		
		year = 2021; //똑같은 이름으로 변수선언은 한번 사용할 수 있다.
					 //변수를 지우고 값을 변경(초기화한다고 표현)
		System.out.println(year);
		int firstDayOfYear = 1; //여러문자의 변수 선언시 뒤에는 첫글자는 대문자로 표현
		
		long sum = 0;
		int firstValue = 2000000000;
		int secondValue = 1000000000; //-214~48 ~ 214~47에서 다시 앞으로 돌아온다
		sum =(long)firstValue + secondValue; //+연산자는 int로 읽는다. 하나의 변수를 바꾸면 큰 걸로 연산한다.
		System.out.println("두수의 합:"+sum);
		
		int num1, num2; //한 라인에 여러 인수 사용할 때 
		 num1 = 10;
		 num2 = 20;
		 
		int summary = num1 + num2; // 변수가 선언되고 초기화 되지 않아 오류가 난다.
									//위에서 값을 할당하면 된다
		
	}
}
//Sout 앞 글자 대문자 쓰고 컨트롤 스페이스바 누르면  system.out.println 
// F2 누르면 이름지정 다시 할 수 있음
//깃허브 사용할때 풀은  오른쪽 상단에서 깃 들어가서 클론 생성 후 URL 복사 하고 인폴트하면 된다
//main 누르고 컨트롤 스페이스바 엔터 하면 자동완성
//  if (a % 3 == 0 && a % 7 == 0) 3의 배수 그리고 7의 배수
//if (a % 3 == 0 || a % 7 == 0) 3의배수 또는 7의 배수 
//Scanner scn = new Scanner(System.in); 


