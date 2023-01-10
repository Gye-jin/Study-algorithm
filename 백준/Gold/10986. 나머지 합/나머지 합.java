import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

	
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    int sum = 0;
    int[] count = new int[m];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
        sum = (sum + Integer.parseInt(st.nextToken())) % m;
        count[sum]++;
    }

    long ans = count[0];
    for (int i = 0; i < m; i++) {
        ans += (long) count[i] * (count[i] - 1) / 2;
    }
    System.out.println(ans);
}
	
}
