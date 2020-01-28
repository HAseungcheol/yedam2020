
public class ContinueExample {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			if(i%2==0) 
				continue; //i 값이 짝수이면 출력을 안하고 다시 위로 올라가고 홀수가 나오면 출력하겠다
			System.out.println("i=>"+i);
		}

	}

}
