import java.util.*;

class Solution
{
	 public int solution(String s)
	    {
	        Stack<Character> stk = new Stack<>();
	        
	        for(char i: s.toCharArray()) {
	        	
	        	if(!stk.isEmpty() && i == stk.peek()) {
	        		stk.pop();
	        	}else {
	        		stk.push(i);
	        	}
	        }
	        
			return stk.isEmpty() ? 1 : 0;
	    }
}