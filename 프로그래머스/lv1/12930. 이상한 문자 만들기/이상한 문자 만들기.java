class Solution {
 	 public String solution(String s) {
	        String[] arr = s.split("");
	        String answer = "";
            int index = 0;
	        for(String str:arr){
                if(str.equals(" ")){
                    answer+=" ";
                    index=0;
                    continue;
                }
            if(index%2==0)
                answer+=str.toUpperCase();
           else
                answer+= str.toLowerCase();
            index+=1;
          }
	        return answer;
	    }
}