class Solution {
  public int solution(int[] num_list) {
		  String odd = "";
		  String even = "";

	        for(int i:num_list) {
	        	if(i%2==0) {
	        		even += String.valueOf(i);
	        	}else {
	        		odd += String.valueOf(i);
	        	}
	        }
	        int answer = Integer.parseInt(odd)+Integer.parseInt(even);	        
	        return answer;
	    }
}