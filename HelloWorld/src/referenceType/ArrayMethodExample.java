package referenceType;

public class ArrayMethodExample {

	public static void main(String[] args) {
		int [] intAry = {3,4,5,7,8};
		System.out.println("배열의길이:"+intAry.length);
		int sum =0;
		sum =sumArrayMethod(intAry);
		 System.out.println("합:"+sum);
		
		 for(int i=0; i<intAry.length; i++) {
			sum += intAry[i];
		}
		System.out.println("합은:"+sum);
	}
	//배열의 요소의 합을 꼐산하는 method.
	public static int sumArrayMethod(int[] ary) {
		int sum=0;
		for(int i=0; i<ary.length; i++) {
			sum += ary[i];		
		}
		return sum;
	}
}
