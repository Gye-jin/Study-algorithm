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
		int x1,x2,y1,y2;
		int[][] array = new int[n][n];
		int[][] sumarray = new int[n+1][n+1];
		for(int i=0;i<n;i++) {
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<n;j++) {
				array[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				sumarray[i][j]= sumarray[i][j-1]+sumarray[i-1][j]-sumarray[i-1][j-1]+array[i-1][j-1];
			}
			
		}
		
		for(int i=0;i<m;i++) {
			st=new StringTokenizer(br.readLine());
			x1=Integer.parseInt(st.nextToken());
			y1=Integer.parseInt(st.nextToken());
			x2=Integer.parseInt(st.nextToken());
			y2=Integer.parseInt(st.nextToken());
			
			int result = (sumarray[x2][y2] - sumarray[x1-1][y2])-(sumarray[x2][y1-1] -sumarray[x1-1][y1-1]);
			
			System.out.println(result);
		}
		
	}

}
