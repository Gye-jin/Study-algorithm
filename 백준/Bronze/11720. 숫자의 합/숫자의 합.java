import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		String snumber = scanner.next();
		char[] cnumber = snumber.toCharArray();
		scanner.close();
		int result = 0;
		
		for(int i=0; i<N;i++) {
			result += cnumber[i] - '0';  // 아스키 코드 '0' 은 48을 뜻함.
		}
		System.out.println(result);
		
	}

}