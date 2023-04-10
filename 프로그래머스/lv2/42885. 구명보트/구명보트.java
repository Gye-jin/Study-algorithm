import java.util.*;

class Solution {
     public int solution(int[] people, int limit) {
     	int answer = 0;
    	Arrays.sort(people);
    	int sum = 0;
    	int index = 0;
        for(int i=people.length-1;i>=0;i--) {
    		if(index >i) {
    			break;
    		}
        	if(people[i]+people[index]<=limit) {
        		index+=1;
        	}
        	answer+=1;
        }
        return answer;
    }
  
}