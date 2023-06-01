import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String jaehwan = br.readLine();
		
		String doctor = br.readLine();
		
		if(jaehwan.length()>=doctor.length()) {
			System.out.println("go");
		}else {
			System.out.println("no");
		}
		

	}

}