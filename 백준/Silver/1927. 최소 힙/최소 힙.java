import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		PriorityQueue<Integer> q = new PriorityQueue<Integer>((o1, o2) -> {

			return o1 - o2;

		});

		int num = scanner.nextInt();

		for (int i = 0; i < num; i++) {
			int n = scanner.nextInt();

			if (n == 0) {
				if (!q.isEmpty())
					System.out.println(q.poll());
				else {
					System.out.println(0);
				}
			} else {
				q.add(n);
			}

		}

	}

}
