class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int index = 0;
        while(answer<=n){
            answer+= numbers[index];
            index++;
        }
        return answer;
    }
}