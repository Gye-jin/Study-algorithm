class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int i=0;
        int j=0;
        int k=0;
        while(k<goal.length) {
        	if(i<cards1.length&&goal[k].equals(cards1[i])) {
        		k+=1;
        		i+=1;
        	}else if(j<cards2.length&&goal[k].equals(cards2[j])) {
        		k+=1;
        		j+=1;
        	}else {
        		break;
        	}
        }
        
        
        return k==goal.length ? "Yes":"No";
    }
}