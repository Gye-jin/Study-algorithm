import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int num = Integer.parseInt(st.nextToken());

		int[] arr = new int[num];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int count = 0;
		for (int i = 0; i < num; i++) {
			int start = 0;
			int last = num - 1;
			while (start < last) {
				if (arr[start] + arr[last] == arr[i] ) {
					if (i != start && i != last) {
						count += 1;
						break;
					} else if (i == start) {
						start+=1;
					} else if (i == last) {
						last-=1;
					}
				} else if (arr[i] > arr[start] + arr[last]) {
					start += 1;

				} else {
					last -= 1;
				}
			}
		}

		System.out.println(count);

	}

}
