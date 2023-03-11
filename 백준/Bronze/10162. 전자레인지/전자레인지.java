
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		if(num>=300) {
			a = num/300;
			num-=300*a;
		}
		if(num>=60) {
			b = num/60;
			num-=60*b;
		}
		if(num%10!=0) {
			System.out.println(-1);
		}else {
			c = num/10;
			System.out.println(a+" "+b+" "+c);
		}
	}

}
