class Solution {
    private int converter(int x,int n){
	        if(x >=65 && x<=90){
	            if(x+n>90)
	                return x+n-90+65-1;
	            return x+n;
	        }else {
	            if(x+n>122)
	                return x+n-122+97-1;
	            return x+n;
	        }
	    }
	    
	    public String solution(String s, int n) {
	        String answer = "";
	        for(int i=0;i<s.length();i++){
	            if(s.charAt(i) !=' ')
	                answer+=(char)converter(s.charAt(i),n);
	            else {
	            	answer+=" ";
	            }
	        }
	        return answer;
	    }
}