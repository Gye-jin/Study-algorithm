class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

            for(var i = 0; i < n; i++){
                String bi = Integer.toBinaryString(arr1[i] | arr2[i]); 

                String row = bi.replace("1", "#");
                row = row.replace("0", " ");

                row = " ".repeat(n - row.length()) + row;
                answer[i] = row;
            }

        return answer;
    }
}