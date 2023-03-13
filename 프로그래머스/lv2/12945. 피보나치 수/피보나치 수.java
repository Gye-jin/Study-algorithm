class Solution {
   public int solution(int n) {
    	int a = 0;
    	int b = 1;
        int answer = 0;
        for(int i=2;i<=n;i++){
        	answer = a+b;
            a = b;
            b =answer;
        }
        return answer%1234567;
    }
}