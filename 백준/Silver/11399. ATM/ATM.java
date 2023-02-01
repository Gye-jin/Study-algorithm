import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		 int[]arr = new int [num];
		 int[] result = new int [num];
		 
		 StringTokenizer st = new StringTokenizer(br.readLine());
		 for(int i=0;i<num;i++) {
			 arr[i] = Integer.parseInt(st.nextToken());
		 }
		 Arrays.sort(arr);
		 
		 result[0] = arr[0];
		 for(int i=1;i<num;i++) {
			 result[i] = arr[i]+result[i-1];
		 }
		 
		 int sum = 0;
		 for(int i:result) {
			 sum+=i;
		 }
		
		 System.out.println(sum);
	}

}
