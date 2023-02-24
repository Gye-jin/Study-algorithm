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
		int arr [] = new int[n];
		int start = 0;
		int last = 0;
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			last+=arr[i];
			if(start<arr[i])
				start=arr[i];
		}
		
		while(start<= last) {
			int mid = (start+last)/2;
			int sum = 0;
			int count = 0;
			for(int i=0;i<n;i++) {
				if(sum+arr[i]>mid) {
					count+=1;
					sum=0;
				}
				sum = sum+arr[i];
			}
			if(sum !=0)
				count+=1;
			if(count > m)
				start= mid+1;
			else
				last=mid-1;
				
		}
		System.out.println(start);
		
	}

}
