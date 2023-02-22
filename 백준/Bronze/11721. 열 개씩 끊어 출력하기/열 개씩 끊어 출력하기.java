import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String word = scanner.next();
		int len = word.length();
		for(int i=1;i<=len/10;i++) {
			System.out.println(word.substring((i-1)*10,i*10));
		}
		
		System.out.println(word.substring(len-len%10,len));

	}

}
