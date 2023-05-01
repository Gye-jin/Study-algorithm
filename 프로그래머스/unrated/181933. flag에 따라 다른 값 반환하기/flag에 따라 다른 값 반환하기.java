class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer;
        if(flag){
            answer = a+b;
        }else{
            answer=a-b;
        }

        return answer;
    }
}