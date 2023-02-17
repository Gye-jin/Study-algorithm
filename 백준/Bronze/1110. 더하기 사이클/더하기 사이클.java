import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner  scanner = new Scanner(System.in);
	
	
	int num = scanner.nextInt();
	int copy = num;
	
	int count = 0;
	 
	while(true){
		num = ((num % 10) * 10) + (((num / 10) + (num % 10)) % 10);
		count++;
	 
		if(copy == num){
			break;
		}
	}
	System.out.println(count);

	}
}

