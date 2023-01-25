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

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		long[] result;
		StringTokenizer st;
		for(int i=0;i<num;i++) {
			long max = 0;
			st= new StringTokenizer(br.readLine());
			int count = st.countTokens();
			result = new long[count];
			for(int j=0;j<count;j++) {
				result[j] = Long.parseLong(st.nextToken());
			};
			for(int j=0;j<result.length-1;j++) {
				for(int h=j+1;h<result.length;h++) {
					long x = gdp(result[h],result[j]);
					max = Math.max(max, x);
				}
				
			}
			System.out.println(max);
		}
		
	}

}
