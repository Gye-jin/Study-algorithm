class Solution {
public int solution(int n) {
        String x = Integer.toString(n,3);
        String reverse = "";
        for(int i=x.length()-1;i>=0;i--) {
        	reverse = reverse+x.charAt(i);
        }

        return Integer.parseInt(reverse,3);
    }
}