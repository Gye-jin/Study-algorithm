import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        int zero = score.length%m;
        for(int i=zero;i<score.length;i+=m){
            answer+=m*score[i];
        }
        
        return answer;
    }
}