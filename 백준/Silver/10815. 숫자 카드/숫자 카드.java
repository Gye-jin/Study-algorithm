import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	static boolean binarySearch(int key, int[]arr) {
		int low = 0;
		int mid;
		int high = arr.length-1;
		while(low <= high) {
			mid = (low + high) / 2;
			
			if(key == arr[mid]) {
				return true;
			} else if(key < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());
		int []arr= new int [num];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<num;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
	
		int count = Integer.parseInt(br.readLine());
		int [] result = new int [count];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<count;i++) {
			result[i] = Integer.parseInt(st.nextToken());
			if(binarySearch(result[i],arr)){
				sb.append(1+" ");
			}else {
				sb.append(0+" ");
			}
		}
		
		
		bw.write(sb+"\n");
		bw.flush();
	}
}