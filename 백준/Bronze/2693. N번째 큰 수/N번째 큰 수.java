import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int arr[];
		
		for(int i=0;i<num;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = st.countTokens();
			arr = new int[x];
			for(int j=0;j<x;j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			
			System.out.println(arr[x-3]);
			
		}
		
		
		
	}

}
