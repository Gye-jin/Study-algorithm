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
	 	
		public int solution(int n, int k) {
			int answer = 0;

			String num = Integer.toString(n, k);
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