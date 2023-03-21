import java.util.Arrays;

class Solution {
   	public boolean check(int [] arr,int target) {
		for(int i=0;i<arr.length;i++) {
			if(target%arr[i] !=0) {
				return false;
			}
		}
		return true;
	}
    
	public int solution(int [] arr) {
		
	    int max = Arrays.stream(arr)
                .max()
                .getAsInt();
	    int value = Arrays.stream(arr)
                .max()
                .getAsInt();
	    while(true) {
	    	if(check(arr, max)) {
	    		return max;
	    	}else {
	    		max+=value;
	    	}
	    }
	    
	}
}