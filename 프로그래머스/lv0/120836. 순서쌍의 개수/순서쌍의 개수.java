class Solution {
    public int solution(int n) {
        int answer = 0;
        int index = 1;
        while(index<=n){
            if(n%index==0){
                answer+=1;
            }
            index+=1;
        }
        
        return answer;
    }
}