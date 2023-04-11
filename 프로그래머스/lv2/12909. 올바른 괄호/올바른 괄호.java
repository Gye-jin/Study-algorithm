import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '('){
                stk.push(c);
            }else{
                if(stk.isEmpty()){
                    answer = false;
                    break;
                }
                stk.pop();
            }
            
        }
        

        return answer && stk.isEmpty();
    }
}