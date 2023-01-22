import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		
		for (int i=0;i<num;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			
			if(n==0) {
				if(!que.isEmpty()){
				System.out.println(que.poll());
			}else {
				System.out.println(-1);
			}
			}else {
				for(int j=0;j<n;j++) {
					que.add(Integer.parseInt(st.nextToken()));
				}
			}
			
		}
	}

}
