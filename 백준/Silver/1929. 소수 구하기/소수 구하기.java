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
		int [] arr = new int [m+1];
		
		for(int i=2;i<=m;i++) {
			arr[i] = i;
		}
		
		for(int i=2;i<=Math.sqrt(m);i++) {
			if(arr[i]==0) {
				continue;
			}
			for(int j = i+i;j<=m;j=j+i) {
				arr[j] = 0;
			}
		}
		for(int i=n;i<=m;i++) {
			if(arr[i] !=0) {
				System.out.println(arr[i]);
			}
		}
		
	}

}
