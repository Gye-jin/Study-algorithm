import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int work:works) {
        	pq.add(work);
        }
        
        while(n>0 && !pq.isEmpty()) {
        	n--;
        	int work = pq.poll()-1;
        	if(work>0)
        		pq.add(work);
        }
        while(!pq.isEmpty())
        	answer+= Math.pow(pq.poll(), 2);
        
        
        return answer;
    }
}