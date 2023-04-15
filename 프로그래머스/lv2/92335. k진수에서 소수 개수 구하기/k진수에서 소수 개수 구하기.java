class Solution {
   public boolean isPrime(Long n) {
		 if (n == 1) {
	            return false;
	        }
	        for (int i = 2; (long) i * i <= n; i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }
	        return true;
		 
	 }
	 public String conversionN(int n, int k){
	        StringBuilder sb = new StringBuilder();
	        int current = n;
	        
	        while(current > 0){
	            
	            sb.append(current%k);
	            
	            current /= k;
	        }
	        
	        return sb.reverse().toString();
	        
	    }
	 
	
		public int solution(int n, int k) {
			int answer = 0;

			String num = conversionN(n, k);
			String[] list = num.split("0");

			for (int i=0;i<list.length;i++) {
				if(list[i].equals(""))
					continue;
				if (isPrime(Long.parseLong(list[i]))) {
					{
						answer += 1;
					}
				}

			}

			return answer;
		}
}