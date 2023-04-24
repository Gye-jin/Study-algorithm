import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0;i<num;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String day = st.nextToken();
			String month = st.nextToken();
			String year = st.nextToken();
			if(Integer.parseInt(day)<10) {
				day = "0"+day;
			}
			if(Integer.parseInt(month)<10) {
				month = "0"+month;
			}
			int birth = Integer.parseInt(year+month+day);
			map.put(name, birth);
		}
		List<Map.Entry<String, Integer>> entryList = new LinkedList<>(map.entrySet());
		entryList.sort(Map.Entry.comparingByValue());
		System.out.println(entryList.get(num-1).getKey());
		System.out.println(entryList.get(0).getKey());
		

		
	}

}