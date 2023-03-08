import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int visited[];
	static ArrayList<Integer> [] arr;
	static int n,m,k,x;
	static List<Integer> result;
	
	private static void BFS(int node) {
		Queue<Integer> que = new LinkedList<Integer>();
		que.add(node);
		visited[node]++;
		while(!que.isEmpty()) {
			int newnode = que.poll();
			for(int i:arr[newnode]) {
				if(visited[i] == -1) {
					visited[i] = visited[newnode]+1;
					que.add(i);
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		x = Integer.parseInt(st.nextToken());
		arr = new ArrayList[n+1];
		result = new ArrayList<Integer>();
		for(int i=1;i<=n;i++) {
			arr[i] = new ArrayList<Integer>();
		}
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine()); 
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			arr[s].add(e);		
		}
		visited = new int [n+1];
		for(int i=0;i<=n;i++) {
			visited[i] = -1;
		}
		BFS(x);
		for(int i=0;i<=n;i++) {
			if(visited[i] == k)
				result.add(i);
		}
		if(result.isEmpty()) {
			System.out.println(-1);
		}else {
			Collections.sort(result);
			for(int i:result) {
				System.out.println(i);
			}
		}
		
	}

}
