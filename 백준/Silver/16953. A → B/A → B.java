import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		int count = 1;
		while(a!=b) {
			if(b<a) {
				count = -1;
				break;
			}
			if(b%2==0) {
				b = b/2;
			}else if(b%10==1){
				b = b/10;

			}else {
				count=-1;
				break;
			}
		count+=1;
		}
		System.out.println(count);
	}

}
