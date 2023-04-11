import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] array = s.toCharArray();
        Arrays.sort(array);
        for(int i=array.length-1;i>=0;i--){
            answer+=array[i];
        }
        return answer;
    }
}