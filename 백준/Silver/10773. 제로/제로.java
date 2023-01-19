import java.io.BufferedReader;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		Stack<Long> stk = new Stack<Long>();
		
		for(int i=0;i<num;i++) {
			long n = scanner.nextInt();
			if(n == 0) {
				stk.pop();
			}else {
				stk.push(n);
			}
		}
		long result = 0;
		while(!stk.isEmpty()) {
			result += stk.pop();
		}
		
		System.out.println(result);
	}

}
