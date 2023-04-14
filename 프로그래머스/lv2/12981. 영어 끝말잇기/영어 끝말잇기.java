import java.util.*;

class Solution {
    	public int[] solution(int n, String[] words) {
		int[] answer = { 0, 0 };
		Set<String> set = new HashSet<String>();
		set.add(words[0]);
		char before = words[0].charAt(words[0].length() - 1);

		for (int i = 1; i < words.length; i++) {
			set.add(words[i]);
			if (!words[i].startsWith(Character.toString(before)) || set.size() != i + 1) {
				answer[0] = (i % n) + 1;
				answer[1] = (i / n) + 1;
				break;
			}
			before = words[i].charAt(words[i].length() - 1);
		}

		return answer;
	}
}