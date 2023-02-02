import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		
		
		long []array = new long[num];
		
		for(int i=0;i<num;i++)
			array[i] = Long.parseLong(br.readLine());
	
	
	Arrays.sort(array);
	
	for(long i:array)
	bw.write(i+"\n");
	
	
	bw.flush();

}

}
