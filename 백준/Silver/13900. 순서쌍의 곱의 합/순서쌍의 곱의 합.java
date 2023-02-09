import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		Long[] arr = new Long[N + 1];
		Long[] sumarr = new Long[N + 1];
		arr[0] = 0L;
		sumarr[0] = 0L;
		for (int i = 1; i <= N; i++) {
			arr[i] = Long.parseLong(st.nextToken());
			sumarr[i] = arr[i] + sumarr[i - 1];
		}
		Long sum = 0L;
		for (int i = 2; i <= N; i++) {
			sum += arr[i] * sumarr[i-1];
		}
		System.out.println(sum);

	}

}
