import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		int result = 1;
		for(int i=0;i<=num;i++) {
			if(i==0) {
				result*=1;
			}else {
				result*=i;
			}
		}
		System.out.println(result);
	}

}
