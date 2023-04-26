import java.util.Scanner;

public class Main {
	 static boolean isPrime(int Number) {
	        if(Number == 1){
	            return false;
	        }
	        for(int i = 2; i <= Math.sqrt(Number); i++) {
	            if(Number % i == 0) return false;
	        }
	        return true;
	    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		long sum = 0;
		int min = Integer.MAX_VALUE;
		for(int i=a;i<=b;i++) {
			if(isPrime(i)) {
				sum+=i;
				if(min == Integer.MAX_VALUE) {
					min = i;
				}
			}
		}
		if(sum==0)
			System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(min);
		}
		

	}

}