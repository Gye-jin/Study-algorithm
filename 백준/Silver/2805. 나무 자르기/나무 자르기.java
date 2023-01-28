import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		long m = Long.parseLong(st.nextToken());
		long min = 0;
		long max = 0;
		long arr[] = new long[n];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<n;i++) {
			arr[i] = Long.parseLong(st.nextToken());
			if(max<arr[i])
				max = arr[i];
		}
		
		
		while(min < max) {
			long mid = (min+max) / 2;
			long sum = 0;
			for(long i:arr) {
				if(i-mid >0)
					sum+=(i-mid);
			}
			if(sum<m)
				max = mid;
			else {
				min = mid+1;
			}
			
		}
		
		
		System.out.println(min-1);
	
	}

}
