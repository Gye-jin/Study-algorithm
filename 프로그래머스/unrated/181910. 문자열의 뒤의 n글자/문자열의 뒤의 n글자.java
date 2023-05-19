class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int len = my_string.length();
        for(int i=len-n;i<len;i++){
            answer+=my_string.charAt(i);
        }
        return answer;
    }
}