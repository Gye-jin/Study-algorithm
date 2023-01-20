import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> q = new PriorityQueue<Integer>((o1,o2) ->{
			return o2-o1;
		});
		
		int num = Integer.parseInt(br.readLine());
		
		
		for(int i=0;i<num;i++) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) {
				if(!q.isEmpty()) {
					System.out.println(q.poll());
				}else {
					System.out.println(0);
				}
			}else {
				q.add(n);
			}
		}
		
		
	}

}
