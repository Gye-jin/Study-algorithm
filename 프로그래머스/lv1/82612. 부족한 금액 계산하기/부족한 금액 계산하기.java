class Solution {
	public long solution(int price,int money,int count) {
		long answer = 0;

		for(int i=1;i<=count;i++) {
			answer += i*price;
		}
		long result =  answer-money;
		
		if(result<=0) {
			return 0;
		}else
		return result;
				
	}
}