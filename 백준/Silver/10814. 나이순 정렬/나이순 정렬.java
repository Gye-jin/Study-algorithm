import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Data implements Comparable<Data> {
	int age;
	String name;

	public Data(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(Data o) {
		return this.age - o.age;
	}
}

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		Data[] arr = new Data[num];

		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i] = new Data(Integer.parseInt(st.nextToken()), st.nextToken());
		}
		Arrays.sort(arr);

		for (int i = 0; i < num; i++)
			System.out.println(arr[i].age+" "+arr[i].name);
	}

}
