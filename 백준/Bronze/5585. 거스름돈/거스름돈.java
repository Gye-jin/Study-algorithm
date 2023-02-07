import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int []arr = {500,100,50,10,5,1};
		
		Scanner scanner = new Scanner(System.in);
		int num = 1000-scanner.nextInt();
		int count = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(num/arr[i]>=0) {
				count+= num/arr[i];
				num = num%arr[i];
			}
		}
		System.out.println(count);
	}

}
