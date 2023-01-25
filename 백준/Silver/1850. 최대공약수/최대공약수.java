import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
		static long gdp(long a, long b) {
			if(b==0) {
				return a;
			}else {
				return gdp(b,a%b);
			}
		}

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner scanner = new Scanner(System.in);
		
		long a = scanner.nextLong();
		long b = scanner.nextLong();
		
		long result = gdp(a,b);
		
		while(result --> 0) {
			bw.write("1");
		}
		
		bw.flush();
		bw.close();
	}

}
