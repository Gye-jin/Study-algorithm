import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		long [] result = new long[10];
		for(int i=0; i<result.length;i++) {
			result[i] = 0;
		}
		String number = "0123456789";
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		String num = String.valueOf(a*b*c);
		
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<num.length();j++) {
				if(num.charAt(j)==number.charAt(i)) {
					result[i] +=1;
				}
			}
		}
		for(long i:result) {
			System.out.println(i);
		}
	}

}
