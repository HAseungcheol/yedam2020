
public class Array2Example {

	
		   public static void main(String[] args) {
//		      int[] intAry = new int[5];
//		      for (int i = 0; i < 5; i++) {
//		         intAry[i] = i * 10 + 10;
//		      }
//		      System.out.println("--------------------");
//		      for (int i = 0; i <= 5; i++) {
//		         System.out.println(intAry[i]);
//		         System.out.println("----------------------");
//		      }
//		       5의 배수를 1~100까지 넣기
		      int[] intAry2 = new int[100];
		      for (int i = 0; i < 100; i++) {
		         intAry2[i] = (i + 1) * 5;
		      }
//		       5칸씩 짤라서 출력하기
//		      for (int i = 0; i < 100; i++) {
//		         System.out.print(intAry2[i] + " ");
//		         if (i % 5 == 4) {
//		            System.out.println();
//		         }
//		      }
//		      while 구문을 이용하기
		      int i = 0;
		      while (i < 100) {
		         System.out.printf("%4d", intAry2[i]); //정렬해서 표현하고자 할 때 printf와 "%숫자d"를 이용한다.
		         if (i % 5 == 4) {
		            System.out.println();
		         }
		         i++;
		      }
		   }
		}