import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long n = Long.parseLong(st.nextToken());
		
		long k = Long.parseLong(st.nextToken());
		
		
		long answer = 1;
		
		for(long i=n;i>(n-k);i--) {
			answer*=i;
		}
		for(int i=1;i<=k;i++) {
			answer/=i;
		}
		System.out.println(answer);
		
	}

}