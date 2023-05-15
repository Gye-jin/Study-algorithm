class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int len = num_list.length;
        if(len>10){
            for(int i:num_list){
                answer+=i;
            }
        }else{
            answer+=1;
            for(int i:num_list){
                answer*=i;
            }
        }
 
        return answer;
    }
}