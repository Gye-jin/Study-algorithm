import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		int arr[] = new int[num];
		
		for(int i=0;i<num;i++) {
			arr[i] = scanner.nextInt();
		}
		
		int count = 1;
		int max = arr[num-1];

		for(int i=num-2;i>=0;i--) {
			if(max<arr[i]) {
				count+=1;
				max = arr[i];
			}
		}
		System.out.println(count);
		
	}
}
