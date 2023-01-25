import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static long gdp(long a,long b) {
		if(b==0)
			return a;
		else
			return gdp(b,a%b);
	}
	
	
		
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long a = Integer.parseInt(st.nextToken());
		long b = Integer.parseInt(st.nextToken());
		
		long result = gdp(a,b);
		
		System.out.println(a*b/result);
		
	}

}
