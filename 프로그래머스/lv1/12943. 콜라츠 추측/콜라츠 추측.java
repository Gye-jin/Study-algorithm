class Solution {
  	public static int solution(long num) {
		int count = 0;
		
		while(num!=1) {
		if(count==500) {
			count=-1;
			break;
		}
		num = num%2 == 0 ? num/2:num*3+1;
		count+=1;
		}
		return count;
	}
}