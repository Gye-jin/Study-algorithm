import java.util.Scanner;

public class Main {
	static long [] arr;
	
	private static long fibonachi(int n) {
		arr = new long[n+1];
		
		arr[0] = 1;
		arr[1] = 1;
		for(int i=2;i<n;++i) {
			arr[i] = arr[i-2]+arr[i-1];
		}
		
		return arr[n-1];	
	}
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(fibonachi(n));

	}

}