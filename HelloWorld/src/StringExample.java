
public class StringExample {
	public static void main(String[] args) {
		System.out.println(3+5);
		System.out.println("두 수의 합은"+8+"입니다.");	
		System.out.println(3+5+"입니다.");
		System.out.println("두수의합" +3+5+ "입니다"); //문자가 먼저 나오면 숫자로 안보고 문자로 본다
													//숫자로 나오게 할려면 (3+5)괄호를 사용해 우선순위 지정
		
		if(5%3 != 0) { 			//if뒤에는 논리 연산자가 필요하다
			System.out.println("입니다.");
		}
		
		int var1 = 10;
		if(var1% 2 == 0) {
		System.out.println("짝수입니다");
		} 
		 else {
			System.out.println("홀수입니다");
		}
		
		System.out.println(3 ==1);
		
		int var3 =30, var4= 20;
		int biggerValue = 0;
		if(var3 >= var4) {
			biggerValue=var3;
		} else {
			biggerValue=var4;
		}
		System.out.println("큰수는" + biggerValue);
		
		biggerValue=(var3>=var4) ? var3:var4;
		System.out.println("큰수는" + biggerValue);
		
			
			
			
			
			
			
			
			
		
		}	
	}


