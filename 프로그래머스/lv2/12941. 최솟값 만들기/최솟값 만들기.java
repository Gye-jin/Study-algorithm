import java.util.Arrays;

class Solution
{
  	public int solution(int [] A, int[] B) {
		int answer = 0;
		int len = A.length;
		Arrays.sort(A);
		Arrays.sort(B);
		if(len%2==0) {
			for(int i=0;i<len;i++) {
				answer=answer+A[i]*B[len-i-1];
			}
		}else {
			answer+=A[0]*B[len-1];
			for(int i=1;i<len;i++) {
				answer=answer+A[i]*B[len-i-1];
			}
		}

		return answer;
	}
}