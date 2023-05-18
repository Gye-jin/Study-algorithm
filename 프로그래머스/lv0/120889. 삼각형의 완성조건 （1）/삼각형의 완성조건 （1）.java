import java.util.*;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int answer = 1;
        if(sides[0]+sides[1]<=sides[2])
            answer+=1;

        return answer;
    }
}