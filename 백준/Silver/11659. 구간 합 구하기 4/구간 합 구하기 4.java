import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] result = new int[n+1];
		st=new StringTokenizer(br.readLine());
		for(int i=1;i<=n;i++) {
			result[i] = result[i-1] + Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<m;i++) {
			st=new StringTokenizer(br.readLine());
			int first = Integer.parseInt(st.nextToken());
			int last = Integer.parseInt(st.nextToken());
			
			System.out.println(result[last]-result[first-1]);
		}
		
		
		
		
	}

}
