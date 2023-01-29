import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		
		
		for(int i=0;i<num;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = st.countTokens();
			for(int j=0;j<x;j++) {
				StringBuffer sb = new StringBuffer(st.nextToken());
				System.out.print(sb.reverse().toString()+" ");
			}
		}
	}

}
