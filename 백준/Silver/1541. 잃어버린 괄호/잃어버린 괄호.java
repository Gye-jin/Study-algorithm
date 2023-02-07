import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(),"-");
		
	
		int num = st.countTokens();
		
		int [] arr= new int[num];
		
		for(int i=0;i<num;i++) {
			StringTokenizer st2 = new StringTokenizer(st.nextToken(),"+");
			int x = st2.countTokens();
			for(int j=0;j<x;j++) {
				arr[i] += Integer.parseInt(st2.nextToken());
			}

		}
		int sum = arr[0];
		for(int i=1;i<num;i++) {
			sum-=arr[i];
		}
		System.out.println(sum);

	}

}
