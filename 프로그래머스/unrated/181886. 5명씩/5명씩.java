
class Solution {
     public String[] solution(String[] names) {
	        String[] answer = new String[names.length%5==0?names.length/5:names.length/5+1];
	        int index = 0;
	        for(int i=0;i<names.length;i+=5){
	            answer[index] = names[i];
	          
	            index +=1;

	        }
	        
	        return answer;
	    }
	
}