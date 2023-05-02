class Solution {
    public int solution(int a, int b) {
	        int answer = Math.max(Integer.parseInt(String.valueOf(a)+String.valueOf(b)),Integer.parseInt(String.valueOf(b)+String.valueOf(a)));
	     return answer;
	    }
}