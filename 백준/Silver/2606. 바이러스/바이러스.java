import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Integer> [] arr;
	static boolean visited[];
	static void DFS(int v) {
		if(visited[v]) {
			return;
		}
		visited[v] = true;
		for(int i:arr[v]) {
			if(visited[i]==false) {
				DFS(i);
			}
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int x = Integer.parseInt(br.readLine());
		arr = new ArrayList[num+1];
		visited = new boolean[num+1];
		for(int i=1;i<num+1;i++) {
			arr[i] = new ArrayList<Integer>();
		}
		
		for(int i=0;i<x;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			arr[s].add(e);
			arr[e].add(s);
		}
		DFS(1);
		
		int count = 0;
		for(boolean i:visited) {
			if(i)
				count+=1;
		}
	System.out.println(count-1);
		
	}

}
