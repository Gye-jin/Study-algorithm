import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
	        
		 	Queue<Integer> que = new LinkedList<Integer>();
		 	for(int i:numlist) {
		 		if(i%n==0) {
		 			que.add(i);
		 		}
		 	}
		 	
	        int[] answer = new int[que.size()];
	        
	        for(int i=0;i<answer.length;i++) {
	        	answer[i] = que.poll();
	        }
	        return answer;
	    }
}