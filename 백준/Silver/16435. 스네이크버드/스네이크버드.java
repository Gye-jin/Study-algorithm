import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int fruit = Integer.parseInt(st.nextToken());
		int snake = Integer.parseInt(st.nextToken());
		int [] arr = new int[fruit];
		
		st= new StringTokenizer(br.readLine());
		for(int i=0;i<fruit;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		for(int i=0;i<fruit;i++) {
			if(snake>=arr[i]) {
				snake+=1;
			}else {
				break;
			}
		}
		System.out.println(snake);
	}

}
