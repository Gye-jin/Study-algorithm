import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		int max = 0;
		int out = 0;
		int in = 0;
		int now =0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i=0; i<4;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			out = Integer.parseInt(st.nextToken());
			in = Integer.parseInt(st.nextToken());
			
			now = now-out+in;
			
			max = Math.max(max, now);
		}
		
		
		
		System.out.println(max);
	}
}
