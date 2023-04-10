class Solution {
    public static int[] solution(String s) {
    	int zero = 0;
    	int count = 0;
    	while(!s.equals("1")) {
    		for(int i=0;i<s.length();i++) {
    			if(s.charAt(i) == '0') {
    				zero+=1;
    			}
    		}
    		s = s.replaceAll("0", "");
    		s = Integer.toBinaryString(s.length());
    		count+=1;
    	}

        return new int[] {count,zero};
    }
}