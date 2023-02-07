import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		int [][] arr = new int [num][2];
		for(int i=0;i<num;i++) {
			arr[i][0]= scanner.nextInt();
			arr[i][1]= scanner.nextInt();
		}
		
		Arrays.sort(arr,new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1]) {
					return o1[0]-o2[0];
				}else {

					return o1[1]-o2[1];
				}
			}
		});
		int count = 0;
		int end = -1;

		for(int i=0;i<num;i++) {
			if(arr[i][0] >= end) {
				end = arr[i][1];
				count++;
			}
		}
		
		System.out.println(count);
	
		

	}

}
