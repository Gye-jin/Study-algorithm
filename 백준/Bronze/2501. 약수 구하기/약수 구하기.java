import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	
	static ArrayList<Integer> arr;
	static int cnt;
	static void divisor(int n) {
		arr = new ArrayList<>();
		cnt = 0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				arr.add(i);
				cnt+=1;
			}
		}	
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num = Integer.parseInt(st.nextToken());
		int target = Integer.parseInt(st.nextToken());
		
		divisor(num);
		if(target>cnt) {
			System.out.println(0);
		}else {
			System.out.println(arr.get(target-1));
		}
	}

}