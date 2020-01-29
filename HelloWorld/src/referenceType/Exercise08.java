package referenceType;

public class Exercise08 {

	public static void main(String[] args) {
		int[][]array = {
				{95,86},{83,92,96},{78,83,93,87,88}	};
		int sum=0;
	//int cnt	
		double avg =0.0;
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length;j++) {
				sum = sum+array[i][j];
				//cnt++
				avg = (double) sum/10; //avg=(double) sum/cnt 
			}
		}
		System.out.println("합계:"+sum);
		System.out.println("평균:"+avg);
	}

}
