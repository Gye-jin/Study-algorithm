import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Integer> [] arr;
	static boolean visited[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int node = Integer.parseInt(st.nextToken());
		int edge = Integer.parseInt(st.nextToken());
		
		arr = new ArrayList[node+1];
		visited = new boolean[node+1];
		for(int i =1;i<node+1;i++) {
			arr[i] = new ArrayList<Integer>();
		}
		for(int i=0;i<edge;i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			arr[s].add(e);
			arr[e].add(s);
		}
		int count = 0;
		for(int i=1;i<node+1;i++) {
			if(!visited[i]) {
				count++;
				DFS(i);
			}
		}
		System.out.println(count);
		

	}
	static void DFS(int v) {
		if(visited[v]) {
			return;
		}
		visited[v] = true;
		for(int i: arr[v]) {
			if(visited[i]==false) {
				DFS(i);
			}
		}
	}
	
}
