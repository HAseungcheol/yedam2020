package referenceType;

public class CalculatorExample {
	public static void main(String[] args) {
	int num1 =10;
	int num2 =20;
	sum(num1, num2);
	minus(num1,num2);
	multi(num1,num2);
	divide(7, 3); //소수점 받을려면 double
	printStar(7,"+");
	int r = sum2(1,2);
	System.out.println("r값은:"+ r);
	String ret = Welcome("하승철");
	System.out.println(ret);
	}
	public static void sum(int a, int b) {
		int result = a+b;
		System.out.println("두수의 합은:"+result);
	}
	public static void minus(int x, int y) {
		int result = x-y;
		System.out.println("두수의 차이는:"+result);
	}
	public static void multi(int x, int y) {
		int result = x*y;
		System.out.println("두수의 곱은:"+result);
	}
	public static void divide(int z, int x) {
		int result = z/x;
		System.out.println("두수의 나눈값:"+result); //소수점 받을려면 double
	}
	public static void printStar(int a, String str) {
		for(int i=0; i<a; i++) {
			for(int j=0; j<=i; j++)
				System.out.print(str);
			System.out.println();
		}
	}
	public static int sum2(int a, int b) {
		int result;
		result = a+b;
		return result; //return으로 result 값을 반환
	}
	public static String Welcome(String name) {
		return "Hello"+name;
	}
}





