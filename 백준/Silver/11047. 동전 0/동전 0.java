import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		int result = Integer.parseInt(st.nextToken());
		int [] arr = new int [num];
		int count=0;
		for(int i=num-1;i>=0;i--) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		for(int i=0;i<num;i++) {
			if(result>=arr[i]) {
				count+=result/arr[i];
				result = result%arr[i];
			}
		}
		System.out.println(count);

	}

}
