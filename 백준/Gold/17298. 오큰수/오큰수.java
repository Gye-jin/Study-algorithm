import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int num = Integer.parseInt(br.readLine());
	int arr [] = new int[num];
	int result [] = new int[num];
	Stack<Integer> stk = new Stack<Integer>();
	
	StringTokenizer st = new StringTokenizer(br.readLine());
	for(int i=0; i< num;i++) {
		arr[i] = Integer.parseInt(st.nextToken());
	}
	stk.push(0);
	for(int i = 1; i< num; i++) {
		while(!stk.isEmpty() && arr[stk.peek()] < arr[i]) {
			result[stk.pop()]= arr[i];
		}
	stk.push(i);	
	}	
	while(!stk.empty()) {
		result[stk.pop()] = -1;
	}
	
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	for (int i = 0; i < num; i++) {
		bw.write(result[i] + " ");
	}
	
	bw.write("\n");
	bw.flush();
	}
		
}
