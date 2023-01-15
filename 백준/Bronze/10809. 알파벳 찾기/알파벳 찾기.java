import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		long[] result = new long[26];
		for(int i=0; i<result.length;i++) {
			result[i] = -1;
		}
		String word = st.nextToken();
		
		
		for(int i=0;i<26;i++) {
			for(int j=0;j<word.length();j++) {
				if(word.charAt(j) == alphabet.charAt(i)) {
					result[i] = word.indexOf(word.charAt(j));
				}
			}

		}

		for(long i:result) {
			System.out.print(i+" ");
		};
	}

}
