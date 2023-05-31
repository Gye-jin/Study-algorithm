class Solution {
    public int solution(int number, int limit, int power) {

		 	int answer = 0;
	        	 	
		 	for(int i=0;i<number;i++) {
		 		int n = divisor(i+1);
		 		if(n>limit) {
		 			answer+=power;
		 		}else {
		 			answer+=n;
		 		}
		 	}
		 	
	        return answer;
	    }
	 
	 int divisor(int n) {
		 int cnt = 0;
		 for(int i=1;i*i<=n;i++){
			 if(i*i == n)
				 cnt+=1;
			 else if(n %i==0)
				 cnt+=2;
		 }
		 return cnt;
		 
	 }
}