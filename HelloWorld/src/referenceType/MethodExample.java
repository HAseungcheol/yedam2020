package referenceType;

public class MethodExample {

	public static void main(String[] args) {
		int num1, num2;
		int result;
		num1 =10;
		num2 =20;
		result = (num1+num2)*3;
		System.out.println("결과값은1:"+result);
		
		multiAfterSum(num1,num2); //메소드 불러와서 계산
		int a1, a2;
		a1=100;
		a2=200;
		result =(a1+a2)*3; 
		multiAfterSum(a1,a2); 
		System.out.println("결과값은:"+result); //복잡한 식으로 과정
	
		}
	//메소드(method)
	public static void multiAfterSum(int a, int b) {
		int n1,n2,rslt;
		n1=a;
		n2=b;
		rslt = (n1+n2)*3;
		System.out.println("결과값은2:"+rslt);
	}
}
