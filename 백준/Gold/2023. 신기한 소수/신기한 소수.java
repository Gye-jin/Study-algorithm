import java.util.Scanner;

public class Main {
	static int num;
	static void DFS(int n,int m) {
		if(m == num) {
			if(isPrime(n)) {
				System.out.println(n);
			}
			return;
		}
		for(int i=1;i<10;i++) {
			if(i%2==0) {
				continue;
			}
			if(isPrime(n*10+i)) {
				DFS(n*10+i, m+1);
			}
		}
	}
	static boolean isPrime(int num) {
		for(int i=2;i<=num/2;i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		num = scanner.nextInt();
		DFS(2,1);
		DFS(3,1);
		DFS(5,1);
		DFS(7,1);

	}

}
