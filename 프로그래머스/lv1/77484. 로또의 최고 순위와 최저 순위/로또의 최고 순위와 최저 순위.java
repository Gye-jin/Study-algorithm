import java.util.*;

class Solution {
   public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        map.put(6, 1);
        map.put(5, 2);
        map.put(4, 3);
        map.put(3, 4);
        map.put(2, 5);
        map.put(1, 6);
        map.put(0, 6);
        
        int count = 0;
        long zero = 0;
        for(int i:lottos) {
        	if(i==0) {
        		zero+=1;
        	}
        }
        
        for(int i:win_nums){
            for(int j:lottos){
               if(i==j){
                    count+=1;
                }
            }
        }

        answer[0] = map.get((int)(zero+count));
        answer[1] = map.get(count);
        return answer;
    }
}