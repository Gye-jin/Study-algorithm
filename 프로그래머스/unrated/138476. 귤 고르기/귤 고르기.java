import java.util.*;

class Solution {
	public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer,Integer> sizeMap = new HashMap<Integer, Integer>();
        
        for(int size:tangerine) {
        	sizeMap.put(size,sizeMap.getOrDefault(size, 0)+1);
        }
        List<Integer> arr = new ArrayList<>(sizeMap.keySet());
        
        arr.sort((o1,o2) -> sizeMap.get(o2)-sizeMap.get(o1));
        int i =0;
        while(k > 0) {
        	k-=sizeMap.get(arr.get(i));
        	answer+=1;
        	i+=1;
        }
        
        return answer;
    }
}