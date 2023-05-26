import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		HashSet<Integer> set = new HashSet<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<num;i++) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		ArrayList<Integer> array = new ArrayList<Integer>(set);
		Collections.sort(array);
		for(int i:array) {
			System.out.print(i+" ");
		}
		
	}

}