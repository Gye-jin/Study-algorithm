import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		PriorityQueue<Integer> pluspq = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> minuspq = new PriorityQueue<>();
		
		int one = 0;
		int zero = 0;
		
		
		for(int i=0;i<num;i++) {
			int x = scanner.nextInt();
			if(x>1) {
				pluspq.add(x);
			}else if(x==1) {
				one+=1;
			}else if(x==0) {
				zero+=1;
			}else {
				minuspq.add(x);
			}
		}
		int sum = 0;
		while(pluspq.size() >1) {
			int first = pluspq.poll();
			int second = pluspq.poll();
			sum +=first*second;
		}
		if(!pluspq.isEmpty()) {
			sum+=pluspq.poll();
		}
		while(minuspq.size() >1) {
			int first = minuspq.poll();
			int second = minuspq.poll();
			sum+= first*second;
		}
		if(!minuspq.isEmpty()) {
			if(zero ==0)
			sum+= minuspq.poll();
		}
		
		sum+=one;
		System.out.println(sum);
		
	}

}
