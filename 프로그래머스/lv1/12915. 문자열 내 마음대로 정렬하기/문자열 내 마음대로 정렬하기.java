import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
        List<String> arr = new ArrayList<String>();
       for(int i=0;i<strings.length;i++) {
    	   arr.add(strings[i]);
       }
       String[] answer = new String[strings.length];
        List<String> list = arr.stream()
            .sorted((a,b) -> a.charAt(n) - b.charAt(n))
            .collect(Collectors.toList());
        int size = 0;
        for(String temp : list) {
        	answer[size++] = temp;
        }
        
        return answer;
    }
}