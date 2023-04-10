class Solution {
        public int solution(int n) {
        int n_num = Integer.bitCount(n);
		int m = n+1;    
    	while(true) {
    		int m_num = Integer.bitCount(m);
    		if(n_num == m_num) {
   
    			break;
    		}else {
    			m = m+1;
    		}
    	
    	}
    	

        return m;
    }
}