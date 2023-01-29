import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		
		for(int i=0;i<num;i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			int result =1;
			for(int j=1;j<=b;j++) {
				result = result *a%10;
			}
			if(result == 0)
				result = 10;
		System.out.println(result);
		}

	}

}
