import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static long gcd(long a, long b) {
		if(b==0)
			return a;
		else
			return gcd(b,a%b);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		
		for(int i=0;i<num;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			long [] arr = new long[n];
			long result = 0;
			for(int j=0;j<n;j++) {
				arr[j]=Long.parseLong(st.nextToken());
			}
			for(int j=0;j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					
					result+=gcd(arr[j],arr[k]);

				}
			}
			System.out.println(result);
		}
	}

}
