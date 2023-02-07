import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
	     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int n = Integer.parseInt(br.readLine());
	        int m = Integer.parseInt(br.readLine());
	        
	        int temp = (n/100)*100;
	        while(true) {
	            // 나누어 떨어질때까지 temp의 값을 늘려가면서 비교
	            if(temp%m == 0) {
	                int result = temp % 100;
	                if(result < 10) System.out.println("0" + result);
	                else System.out.println(result);
	                return;
	            }
	            temp++;
	        }

	}

}
