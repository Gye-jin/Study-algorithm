import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		int[] score = new int[count];
		
		
		for(int i=0; i<count;i++) {
			score[i]= scanner.nextInt();
		}
		double max = score[0];
		double sum = score[0];
		for(int i=1;i <score.length;i++) {			
			if(score[i]>max) {
				max = score[i];
			}
		sum+=score[i];
		}

		
		
		System.out.println((sum*100)/(max*count));
	}

}