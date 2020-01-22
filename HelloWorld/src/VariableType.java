
public class VariableType {
	public static void main(String[] args) {
		byte var1, var2; 
		int sum;
		var1 = 55;
		var2 = 33;
		sum = var1 + var2;   //sum = (byte)((byte)var1+(byte)va2);

		char chr1 = 65;
		System.out.println(chr1);
		
		for(int i =0;  i<10;  i++) {
			chr1 = (char) (chr1+1); //강제 타입 변환 작은거에서 큰걸로 앞에(char)사용해서 int를 char로 변환 
			System.out.println(chr1);
		}
  }
}
