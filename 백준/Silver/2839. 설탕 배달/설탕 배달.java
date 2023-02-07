
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		int count = 0;

		while(num>0) {
			if(num%5==0) {
				count+=num/5;
				break;
			}
			num-=3;
			count+=1;
		}
		if(num<0)
			System.out.println(-1);
		else
			System.out.println(count);

	}

}
