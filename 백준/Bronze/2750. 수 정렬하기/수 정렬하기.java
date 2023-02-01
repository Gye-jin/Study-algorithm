import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);
		
		int num = scaner.nextInt();
		int [] arr = new int[num];
		for(int i=0;i<num;i++) {
			arr[i] = scaner.nextInt();
		}
	
		Arrays.sort(arr);
		for(int i:arr)
		System.out.println(i);
	}

}
