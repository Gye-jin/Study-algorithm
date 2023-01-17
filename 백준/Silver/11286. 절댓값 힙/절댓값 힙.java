import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		PriorityQueue<Integer> arr = new PriorityQueue<>((o1,o2) -> {
					int first = Math.abs(o1);
					int second = Math.abs(o2);
					if(first == second)
						return o1 > o2 ? 1 :-1;
					else
						return first - second;
				});
		
		for(int i=0; i<num;i++) {
			int n = scanner.nextInt();
			
			if(n == 0) {

				if(arr.isEmpty()) {
					System.out.println(0);
				}else {
					System.out.println(arr.poll());
				}

			}
			else{
				arr.add(n);
			}
		}
		
	}

}
