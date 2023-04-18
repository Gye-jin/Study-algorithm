class Solution {
    public int solution(int n, int k) {
        int food = 12000;
        int drink = 2000;
       
        
        return food*n+drink*(k-n/10);
    }
}