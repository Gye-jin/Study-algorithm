import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		
		Long s = scanner.nextLong();
		Long n = 1L;
		while(n*(n+1)/2<=s) {
			n+=1;
		}
	System.out.println(n-1);
	}
}
