import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		
		String []arr = new String[num];
		
		for(int i=0;i<num;i++) {
			arr[i] = br.readLine();
		}
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String s1, String s2) {
	
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
				} 
	
				else {
					return s1.length() - s2.length();
				}
			}
		});
	
		bw.write(arr[0]+"\n");
		
		for(int i=1;i<num;i++) {
			if(!arr[i].equals(arr[i-1])) {
				bw.write(arr[i]+"\n");
			}
			
		}
		bw.flush();
        br.close();
        bw.close();

	}

}
