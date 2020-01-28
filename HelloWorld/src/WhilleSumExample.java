
public class WhilleSumExample {

	public static void main(String[] args) {
		//1~5 까지 합을 구하는 식
		int sum = 0;
		int i =1;  //초기값을 while 시작전에 선언 해줘야 한다.
		while(i<=5) {
			sum =sum +i;
			i++;
			
		}
		System.out.println("합계는" + sum);
	}

}
