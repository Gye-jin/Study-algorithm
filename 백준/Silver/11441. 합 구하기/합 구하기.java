import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		int [] arr = new int [num+1];	
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr[0] = 0;
		for(int i=1;i<=num;i++) {
			arr[i] = arr[i-1]+Integer.parseInt(st.nextToken());
		}
		int x = Integer.parseInt(br.readLine());
		
		for(int i=0;i<x;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			System.out.println(arr[b]-arr[a-1]);
		}
		
	}

}
