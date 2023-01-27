import java.util.Scanner;

public class Main {
	
	static void Hanoi(int num, int x, int y, StringBuilder sb) {
		if(num>1) {
			Hanoi(num-1,x,6-x-y,sb);
		}
		sb.append(x+" "+y).append("\n");
		if(num>1) {
			Hanoi(num-1,6-x-y,y,sb);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int num = scanner.nextInt();
		
		int count = (int) (Math.pow(2, num)-1);
		sb.append(count).append("\n");
		
		Hanoi(num, 1, 3, sb);
		
		System.out.println(sb);
		

	}

}
