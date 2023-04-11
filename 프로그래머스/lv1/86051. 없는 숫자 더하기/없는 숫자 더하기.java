import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int [] arr = {0,1,2,3,4,5,6,7,8,9};
        for(int i:numbers){
            for(int j:arr){
                if(i ==j){
                answer+=i;
                break;
                }
            }
        }

        return 45-answer;
    }
}