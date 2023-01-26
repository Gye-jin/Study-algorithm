import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	
	static void move(int N, int x, int y) {
		if(N==1) {
            System.out.println(x+" "+y);
        }else {
            move(N-1,x,6-x-y);
            System.out.println(x+" "+y);
            move(N-1,6-x-y,y);
        }
		
	
	}
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		BigInteger result=new BigInteger("1");
		if(num==1)
			System.out.println(1);
		else {
			 for(int i=0;i<num;i++) {
	                result=result.multiply(new BigInteger("2"));
	            }
	            result=result.subtract(new BigInteger("1"));
	            System.out.println(result);
		}
			
		if(num<=20) {
			move(num,1,3);
        }
		
		

	}

}