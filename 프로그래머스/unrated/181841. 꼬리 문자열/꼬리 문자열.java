class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        for(String st : str_list){
            if(!st.contains(ex))
                answer+=st;
        }
        return answer;
    }
}