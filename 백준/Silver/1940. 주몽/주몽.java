import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	
	
	public static void main(String[] args) throws IOException {
	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int target = Integer.parseInt(st.nextToken());
		
		int [] array = new int [n]; 
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(array);
		
		int i = 0;
		int j = n-1;
		int count =0;
		while(i<j) {
			if(array[i]+array[j]== target) {
				count+=1;
				i+=1;
				j-=1;
			}else if(array[i]+array[j]>target) {
				j-=1;
			}else {
				i+=1;
			}
		}
		
		System.out.println(count);
	}

}
