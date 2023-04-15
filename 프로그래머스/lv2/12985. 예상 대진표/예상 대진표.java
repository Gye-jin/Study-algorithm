class Solution
{
    public int solution(int n, int a, int b){   
       int answer = 1;
       if(a>b) {
    	   int temp = b;
    	   b = a;
    	   a = temp;
       }
       
       while(n !=0) {
    	   n /=2;
    	   if(a%2==1 && b-a==1) {
    		   break;
    	   }
    	   a = (a+1)/2;
    	   b = (b+1)/2;
    	   answer+=1;
       }
   

        return answer;
    }
}