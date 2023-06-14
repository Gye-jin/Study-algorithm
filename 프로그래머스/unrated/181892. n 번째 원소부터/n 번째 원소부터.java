class Solution {
     public int[] solution(int[] num_list, int n) {
	        int num = num_list.length-n+1;
	        int[] answer = new int[num];
	        
	        for(int i=0;i<answer.length;i++){
	            
	            answer[i] = num_list[num_list.length-num+i];
	        }
	        
	        return answer;
	    }
}