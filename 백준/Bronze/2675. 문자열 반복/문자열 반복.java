import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		for(int i=0;i<num;i++) {
			StringTokenizer st= new StringTokenizer(br.readLine());
			int x= Integer.parseInt(st.nextToken());
			String word = st.nextToken();
			int line = word.length();
			String[] result = new String[line+1];
			for(int j=0;j<line;j++) {
				for(int k=0;k<x;k++) {
					System.out.print(word.substring(j,j+1));
				}
			
			}
			System.out.println();
		}
	}

}
