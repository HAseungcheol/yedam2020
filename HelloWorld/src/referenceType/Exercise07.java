package referenceType;

public class Exercise07 {
	public static void main(String[] args) {
		int max =0;
		int[] intAry = {1,5,3,8,2};
		for(int i=0; i<intAry.length; i++) {
			if(max<intAry[i]) {
				max=intAry[i];
			}
		}
		System.out.println("최대값:"+max);
	}
	}


