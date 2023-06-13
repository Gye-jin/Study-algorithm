import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		OutputStreamWriter writer = new OutputStreamWriter(System.out);
		for(int i=0;i<num/4;i++) {
			writer.write("long ");
		}
		
		writer.write("int");
		
		
		writer.flush();
	}

}