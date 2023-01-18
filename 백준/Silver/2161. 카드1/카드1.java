import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		int[] result = new int[num];

		Queue<Integer> arr = new LinkedList<Integer>();

		for (int i = 1; i <= num; i++) {
			arr.add(i);
		}
		for (int i = 0; i < num; i++) {
			result[i] = arr.poll();
			arr.add(arr.poll());
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for (int i = 0; i < num; i++) {
			bw.write(result[i] + " ");
		}
		bw.write("\n");
		bw.flush();
	}

}
