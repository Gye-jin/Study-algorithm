import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		
		for(int i=0;i<num;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int arr_a[] = new int [a];
			int arr_b[] = new int [b];
			int count = 0;
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<a;j++) {
				arr_a[j] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr_a);
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<b;j++) {
				arr_b[j] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr_b);
			for(int x:arr_a) {
				for(int y:arr_b) {
					if(x<=y)
						break;
					else
						count++;
				}
			}
			
			System.out.println(count);
			
		}
	}

}
