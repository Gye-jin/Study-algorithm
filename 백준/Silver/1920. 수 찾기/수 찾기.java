import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int arr[] = new int [num];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<num;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int count = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<count;i++) {
			boolean find = false;
			int target = Integer.parseInt(st.nextToken());
			int start = 0;
			int last = num-1;
			while(start<=last) {
				int mid = (start+last)/2;
				
				if(arr[mid]>target) {
					last = mid-1;
				}else if(arr[mid]<target) {
					start = mid+1;
				}else {
					find = true;
					break;
				}
			}
			if(find) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
			
			
		}
		
		
	}

}
