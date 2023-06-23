class Solution {
    public int solution(int a, int b) {
        int answer =  Integer.parseInt(String.valueOf(a)+String.valueOf(b));
        return answer>a*b*2 ? answer :a*b*2;
    }
}