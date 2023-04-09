import java.util.ArrayList;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
    	for(int k=right;k>=left;k--) {
        	ArrayList<Integer> arr = new ArrayList<>();
        	int sqrt = (int) Math.sqrt(k);
        	for(int i = 1; i <= sqrt; i++) {
        		if(k % i ==0) {
        			arr.add(i);
        			if(k/i != i) {
        				arr.add(k/i);
        			}
        		}
        	}
        	if(arr.size()%2==0) {
            	answer+=k;
        	}else {
        		answer-=k;
        	}

    	}

    	
        return answer;
    }
}