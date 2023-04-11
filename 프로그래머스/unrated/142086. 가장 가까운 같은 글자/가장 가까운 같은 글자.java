class Solution {
    	public int[] solution(String s) {
        int[] answer = new int[s.length()];
        for(int i=0;i<s.length();i++){
            int count = 0;
            for(int j=i-1;j>=0;j--){
                if(s.charAt(i) == s.charAt(j)){
                    count = i-j;
                    break;
                }               
            }
             if(count == 0)
                    answer[i] = -1;
             else 
            	 answer[i] = count;
             }   
        return answer;
    }
}