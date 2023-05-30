class Solution {
    public int solution(int n) {
		 	String x = String.valueOf(n);
	        int answer = 0;
	        for(int i=0;i<x.length();i++) {
	        	answer+=Integer.parseInt(x.substring(i,i+1));
	        }
	        return answer;
	    }
}