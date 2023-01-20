import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
	
		Queue<Integer> q = new LinkedList<Integer>();
		

		for(int i=1;i<=num;i++) {
			q.add(i);
		}
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		while(q.size() !=1) {
				for(int i=0;i<n-1;i++) {
					q.add(q.poll());	
		}
				sb.append(q.poll()+", ");
		
		}
		sb.append(q.poll()+">");
		
		bw.write(sb.toString()+"\n");
		bw.flush();
	}
}
