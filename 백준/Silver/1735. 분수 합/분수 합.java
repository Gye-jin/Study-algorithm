import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int gdp(int a, int b) {
		if(b==0)
			return a;
		else
			return gdp(b,a%b);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		
		int result = b*d/gdp(b,d);
		int num = a*(result/b)+c*(result/d);
		
		int x = gdp(result,num);
		
		System.out.println(num/x+" "+result/x);
		
	}

}
