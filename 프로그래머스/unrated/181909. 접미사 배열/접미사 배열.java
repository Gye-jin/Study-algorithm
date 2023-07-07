import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        
        int index = 0;
        for(int i=my_string.length()-1;i>=0;i--){
            answer[index] = my_string.substring(i,my_string.length());
            index+=1;
        }
        
        Arrays.sort(answer);
        return answer;
    }
}