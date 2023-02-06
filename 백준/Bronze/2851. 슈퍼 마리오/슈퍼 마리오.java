import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


		int sum = 0;
		int diff = 100;
		int result = -1;
		
		for(int i=0;i<10;i++) {
			sum+= scanner.nextInt();
			if(Math.abs(100-sum)<=diff) {
				diff = Math.abs(100-sum);
				result = sum;
			}
		}
		
		System.out.println(result);
		
		

	}

}
