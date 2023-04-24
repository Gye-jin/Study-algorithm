import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String num = scanner.next();
		
		int zero = 0;
		int one = 0;
		
		if(num.charAt(0)=='0') {
			zero+=1;
		}else {
			one+=1;
		}
		
		for(int i=1;i<num.length();i++) {
			if(num.charAt(i)!=num.charAt(i-1)) {
				if(num.charAt(i)=='0') {
					zero+=1;
				}else {
					one+=1;
				}
			}
		}
		System.out.println(Math.min(zero, one));
	}

}