import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		int num = scanner.nextInt();
		Queue<Integer> arr = new LinkedList<Integer>();
		
		for(int i=1;i<=num;i++) {
			arr.add(i);
		}
		
		while(arr.size()>1) {
			arr.poll();
			arr.add(arr.poll());
			
			
			
		}
	System.out.println(arr.poll());
	}
	

}
	
