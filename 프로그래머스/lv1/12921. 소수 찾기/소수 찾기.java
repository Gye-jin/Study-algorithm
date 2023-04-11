class Solution {
    public int solution(int num) {
		int answer = 0;
		for(int i=2;i<=num;i++) {
            boolean flag = true;
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0){
                    flag = false;
                    break;
                 }    
			}
            if(flag==true)
                answer+=1;
		}

		return answer;
	}
}