import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		int num = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());	
		Queue<Integer> que = new LinkedList<Integer>();
		for(int i=1;i<=num;i++) {
			que.add(i);
		}
		
		sb.append("<");
		
		
		while(que.size() !=1) {
			for(int i=0;i<n-1;i++) {
				que.add(que.poll());
			}
			sb.append(que.poll()+", ");
		}
		
		sb.append(que.poll()+">");
		
		
		System.out.println(sb);
		
	}

}
