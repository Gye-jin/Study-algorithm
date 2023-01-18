import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {

		Stack<Integer> stk = new Stack<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());
		int [] result = new int [num];
		
		int start = 0;
		
		while(num --> 0) {
			int value = Integer.parseInt(br.readLine());
			
			if(value > start) {
				for(int i = start+1; i<=value;i++) {
					stk.push(i);
					sb.append('+').append("\n");
				}
				start = value;
			}
			else if(stk.peek() != value) {
				
				System.out.println("NO");
				return;
			}
			stk.pop();
			sb.append('-').append("\n");
		}
		
		System.out.println(sb);
	}
}
