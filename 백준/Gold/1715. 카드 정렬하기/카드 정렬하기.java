import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		int num = scanner.nextInt();
		int []arr = new int[num];
		
		for(int i=0;i<num;i++) {
			pq.add(scanner.nextInt());
		}
		int data1;
		int data2;
		int sum=0;
		while(pq.size() != 1) {
			data1 = pq.poll();
			data2 = pq.poll();
			sum += data1+data2;
			pq.add(data1+data2);
		}
		System.out.println(sum);
	}

}
