
public class ArrayExample {

	public static void main(String[] args) { //배열
		int [] intAry = {2,3,4,5};
		int [] int2Ary = new int[5];
		int2Ary[0] =1;
		int2Ary[5] =10;  //오류가남. 배열이 5까지인데 넘어서 오류가 나온다.
//		int [] int3Ary = null;
//		int3Ary =new int[] {1,2,3}; 이렇게 사용할수 있지만 위에 방법으로 통일해서 사용 
 		System.out.println(intAry[0]);
		System.out.println(intAry[1]);
		System.out.println(intAry[2]);
		System.out.println(intAry[3]);
		
		System.out.println("------------");
		
		intAry[0]= 20;
		intAry[1]= 30;
//		System.out.println(intAry[0]);
//		System.out.println(intAry[1]);
		for (int i=0; i<4; i++) {
			System.out.println(intAry[i]);
		}
		//intAry에 10,20,30,40의 값을 할당(대입)
		
		for (int i=0; i<4; i++) {
			intAry[i]=i*10+10;
			}
		System.out.println("============");
		for(int i=0; i<4; i++) {
			System.out.println(intAry[i]);
		}
		System.out.println("++++++++++++++");
		int sum = 0;
		for(int i=0; i<4; i++) {
			sum = sum+intAry[i];
			//sum += intAry[i];
			System.out.println(sum);
		}
		
		 
		
	}
}	


