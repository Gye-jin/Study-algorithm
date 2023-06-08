import java.util.*;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        Stack<Integer> stk = new Stack<>();
        for(int i=1;i<food.length;i++){
            for(int j=0;j<food[i]/2;j++){
                answer+=i;
                stk.push(i);
            }
        }
        answer+="0";
        
        while(!stk.isEmpty()){
            answer+=stk.pop();
        }
        
        return answer;
    }
}