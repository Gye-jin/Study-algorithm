import java.util.*;
class Solution {
    public String[] solution(String[] names) {
        String[] answer = new String[names.length%5];
        int index = names.length/5*5;
        for(int i=0;i<answer.length;i++){
            answer[i] = names[index];
            index+=1;
        }
         Arrays.sort(answer);
        
        return answer;
    }
}