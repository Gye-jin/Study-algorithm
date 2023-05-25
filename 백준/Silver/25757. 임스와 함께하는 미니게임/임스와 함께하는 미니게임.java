import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num = Integer.parseInt(st.nextToken());
		
		char play = st.nextToken().charAt(0);
		
		HashSet<String> set = new HashSet<>();
		
		for(int i=0;i<num;i++) {
			set.add(br.readLine());
		}
		System.out.println(solution(play,set.size()));
		
	}
	
	public static int solution(char play, int size) {
		return play == 'Y' ? size :  play == 'F' ? size/2 : size/3; 
	}

}