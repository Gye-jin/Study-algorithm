import java.util.*;

class Solution {
    public String solution(String s) {
      StringTokenizer st = new StringTokenizer(s);
		StringBuffer sb = new StringBuffer();
		int count = st.countTokens();
		int[] arr = new int[count];
		for(int i=0;i<count;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		sb.append(arr[0]+" "+arr[count-1]);
		return sb.toString();
    }
}