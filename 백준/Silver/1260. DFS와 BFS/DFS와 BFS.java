import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int node;
	static int edge;
	static int start;
	static ArrayList<Integer>[] arr;
	static boolean visited[];
	
	static void DFS(int v){
		System.out.print(v+" ");
		if(visited[v]) {
			return;
		}
		visited[v] = true;
		for(int i:arr[v]) {
			if(visited[i] == false) {
				DFS(i);
			}
		}
	}
	static void BFS(int v) {
		Queue<Integer> que = new LinkedList<Integer>();
		que.add(v);
		visited[v] = true;
		
		while(!que.isEmpty()) {
			int now = que.poll();
			System.out.print(now+" ");
			for(int i:arr[now]) {
				if(!visited[i]) {
					visited[i] = true;
					que.add(i);
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		node = Integer.parseInt(st.nextToken());
		edge = Integer.parseInt(st.nextToken());
		start = Integer.parseInt(st.nextToken());
		arr = new ArrayList[node+1];
		
		for(int i=1;i<node+1;i++) {
			arr[i] = new ArrayList<Integer>();
		}
		for(int i=0;i<edge;i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());			
			arr[s].add(e);
			arr[e].add(s);
		}
		for(int i=1;i<node+1;i++) {
			Collections.sort(arr[i]);
		}
		visited = new boolean[node+1];
		DFS(start);
		System.out.println();
		visited = new boolean[node+1];
		BFS(start);
	}

}
