import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int [] arr = new int [num];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int sum = 0;
		for(int i=0;i<x;i++) {
			sum+=arr[i];
		}
		int max = sum;
		int count = 1;
		for (int i = x; i < arr.length; i++) {
			sum+= arr[i]-arr[i-x];
			if(max==sum)
				count+=1;
			else if(max<sum) {
				max = sum;
				count=1;
			}

		}
		if (max != 0) {
			System.out.println(max);
			System.out.println(count);

		} else {
			System.out.println("SAD");
		}
		
	}

}