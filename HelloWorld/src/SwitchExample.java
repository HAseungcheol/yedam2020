
public class SwitchExample {

	public static void main(String[] args) {
		
		
		int result = (int) (Math.random()*6)+1; //+1을 해서 1부터 6까지의 숫자가 실행할때마다 랜덤으로 나옴
		System.out.println(result);
		
		switch(result) {
		case 1:
		System.out.println("1번이 나왔습니다.");
			break;
		case 2:
		System.out.println("2번이 나왔습니다.");
			break;
		case 3:
		System.out.println("3번이 나왔습니다.");
			break;
		case 4:
		System.out.println("4번이 나왔습니다.");
			break;
		case 5:
		System.out.println("5번이 나왔습니다.");
		
		System.out.println(result);
		}
		
//		int grade =85;
//		grade= grade/10;
//		switch(grade) {
//		case 10:
//			System.out.println("A+학점");
//		case 9:
//			System.out.println("A학점");
//		case 8:
//			System.out.println("B학점");
//		case 7:
//			System.out.println("C학점");
//		}
		
	
		int grade =7;
		if(grade==9) {
			System.out.println("A+학");
		}else if(grade==8) {
			System.out.println("A학");
		}else if(grade==7) {
			System.out.println("B학");
		}else if(grade==6) { 
			System.out.println("C학");
		}else {
			System.out.println("f학");
	}
				
		
	
	}
	
}


