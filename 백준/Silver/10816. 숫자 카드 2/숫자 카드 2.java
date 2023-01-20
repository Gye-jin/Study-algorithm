import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	private static int lowerBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length;

        while (low < high) {
            int mid = (low + high) / 2;
            if (target <= arr[mid]) {
                high = mid;
            }
            else {
                low = mid + 1;
            }
        }
        return low;
    }
	
    private static int upperBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length;

        while (low < high) {
            int mid = (low + high) / 2;
            if (target < arr[mid]) {
                high = mid;
            }
            else {
                low = mid + 1;
            }
        }
        return low;
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
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<count;i++) {
			int m = Integer.parseInt(st.nextToken());
			sb.append(upperBound(arr,m)-lowerBound(arr, m)).append(" ");
			
		}
		
		bw.write(sb+"\n");
		bw.flush();
		
		
		
	}
	
	
}
