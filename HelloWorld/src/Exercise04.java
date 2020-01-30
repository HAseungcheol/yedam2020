
public class Exercise04 {
	public static void main(String[] args) {
		int num1, num2;
		while (true) {
			num1 = (int) (Math.random() * 6) + 1; //숫자 6까지 랜덤
			num2 = (int) (Math.random() * 6) + 1;
			if (num1 + num2 ==5) {
				break;
			}
		System.out.println("("+num1+","+num2+")");
		}
	
		
		
	}
}
