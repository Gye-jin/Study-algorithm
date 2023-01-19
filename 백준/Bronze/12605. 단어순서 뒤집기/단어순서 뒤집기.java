import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		Stack<String> stk = new Stack<String>();
		
		for(int i=1;i<=num;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n=st.countTokens();
			int m = st.countTokens();
			while(n-- > 0) {
				stk.push(st.nextToken());	
			}
			System.out.print("Case #"+i+": ");
			while(m-- > 0) {
				System.out.print(stk.pop()+" ");
			}
			System.out.println();
		}
		
	}

}
