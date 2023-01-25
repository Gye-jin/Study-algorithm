import java.util.Scanner;

public class Main {
		
		static int gdp(int a, int b) {
			if(b==0)
				return a;
			else
				return gdp(b,a%b);
		}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int result = gdp(a,b);
		System.out.println(result);
		System.out.println(a*b/result);
		
	}

}
