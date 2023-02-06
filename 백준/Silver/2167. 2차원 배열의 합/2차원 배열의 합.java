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
		
		int [][] arr = new int[n][m];
		int [][] sumarr = new int[n+1][m+1];
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<m;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				sumarr[i][j] = sumarr[i-1][j]+sumarr[i][j-1]-sumarr[i-1][j-1]+arr[i-1][j-1];
			}
		}
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0;i<num;i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
		
		int result = sumarr[x2][y2]-sumarr[x1-1][y2]-sumarr[x2][y1-1]+sumarr[x1-1][y1-1];
		
		System.out.println(result);
		}
		
	}

}
