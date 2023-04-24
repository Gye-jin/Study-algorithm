import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		
		
		Scanner scanner = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String word = scanner.next();
		
		for(int i=0;i<alphabet.length();i++) {
			int count=0;
			for(int j=0;j<word.length();j++) {
			
				if(alphabet.charAt(i)==word.charAt(j)) {
					count+=1;
				}
			}
			bw.write(count+" ");
		}
		bw.close();
	}
	


}