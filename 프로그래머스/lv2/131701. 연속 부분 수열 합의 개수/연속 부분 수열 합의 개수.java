import java.util.*;

class Solution {
   int find_sum(int[] elements, int start, int end) {
	        int sum = 0;
	        int len = elements.length;
	        for (int i = start; i < end; i++) {
	            sum += elements[i % len];
	        }
	        return sum;
	    }
		
	 public int solution(int[] elements) {
		 	Set<Integer> set = new HashSet<Integer>();
		 	for(int i=1;i<=elements.length;i++) {
		 		for(int j=0;j<elements.length;j++) {
		 			set.add(find_sum(elements,j,i+j));
		 		}
		 	}
		 	return set.size();
	    }
}