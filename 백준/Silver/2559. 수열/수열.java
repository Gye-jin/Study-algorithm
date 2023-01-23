import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static <T> void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int a = num-x+1;
		int [] arr = new int [num];
		int [] result = new int [a];
		
		st = new StringTokenizer(br.readLine()); 
		for (int i=0;i<num;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		int n =0;
		while(a-->0) {
			for(int i=n;i<x+n;i++) {
				result[n] += arr[i];
			}
			n+=1;
		}
		
	
	System.out.println(Arrays.stream(result)
            .max()
            .getAsInt());
	}

}
