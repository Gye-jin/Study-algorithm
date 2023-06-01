import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws IOException {
		HashMap<String, String> map = new HashMap<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		map.put("black", "0");
		map.put("brown", "1");
		map.put("red", "2");
		map.put("orange", "3");
		map.put("yellow", "4");
		map.put("green", "5");
		map.put("blue", "6");
		map.put("violet", "7");
		map.put("grey", "8");
		map.put("white", "9");
		
		String first = br.readLine();
		String second = br.readLine();
		String third = br.readLine();
		
		Long answer = (((Long.parseLong(map.get(first))*10)+Long.parseLong(map.get(second))))*(long)Math.pow(10.0, (double) Integer.parseInt(map.get(third)));

		System.out.println(answer);

	}

}