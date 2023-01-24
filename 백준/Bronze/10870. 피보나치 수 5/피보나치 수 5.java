import java.util.Scanner;

public class Main {

	public static int fibo(int num) {
		if (num <= 1)
			return num;
		else
			return fibo(num - 2) + fibo(num - 1);

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();

		System.out.println(fibo(num));

	}

}
