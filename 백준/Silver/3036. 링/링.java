import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int gcd(int a, int b) {
		if(b==0)
			return a;
		else
			return gcd(b,a%b);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		
		for(int i=0;i<num-1;i++) {
			int y = Integer.parseInt(st.nextToken());
			int n=gcd(x,y);
			
			System.out.println(x/n+"/"+y/n);
		}
	}

}
