package referenceType;

public class GetMaxValueExample {

	public static void main(String[] args) {
		int [] intAry = {8,7,10,5,9};  
		int max =0;  //최소값 구할려면 제일 큰 숫자 넣어주고 부호 변경
		
		for (int i=0; i<intAry.length; i++) {
			if(max<intAry[i]) {
				max=intAry[i];
			}
		}
		System.out.println("최대값:"+max);		
		System.out.println("최대:"+getMaxValue(intAry)); //메소드 가져와서 출력
	}
public static int getMaxValue(int[] ary) {
	int max =0;
	for (int i=0; i<ary.length; i++) {
		if(max<ary[i]) {
			max=ary[i];
		}
	}
	 return max;
	}

}