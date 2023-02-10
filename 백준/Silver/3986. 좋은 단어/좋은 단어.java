import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	static int count;
	
	static void check(String s) {
		if (s.length() % 2 == 1)
			return;
		Stack<Character> stack = new Stack<>();
		stack.push(s.charAt(0)); // 첫 단어는 스택에 push
		for (int i = 1; i < s.length(); i++) {
			if (stack.size() > 0 && stack.peek() == s.charAt(i)) {
				stack.pop();
			} else {
				stack.push(s.charAt(i));
			}
		}
		if (stack.isEmpty())
			count++;

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		count = 0;

		for (int i = 0; i < num; i++) {
			String s = br.readLine();
			check(s);
		}

		System.out.println(count);

	}



}
