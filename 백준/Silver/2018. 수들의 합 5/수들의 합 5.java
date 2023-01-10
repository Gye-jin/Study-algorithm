import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int start =1;
		int count=1;
		int end=1;
		int sum = 1;
		

		while(start <n) {
			if(sum ==n) {
				count+=1;
				sum-=start;
				start+=1;
			}else if(sum<n) {
				end+=1;
				sum+=end;
			}else {
				sum -= start;
				start+=1;
			}
		}
	System.out.println(count);	
	}

}