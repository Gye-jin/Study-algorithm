class Solution {
	public static int[] solution(int[] arr) {
		int min = arr[0];
		if (arr.length == 1) {
			return new int[] {-1};
		}
		int target = 0;
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i]) {
				min = arr[i];
				target = i;
			}
		}
		int[] answer = new int[arr.length - 1];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if(i!=target) {
				answer[index++] = arr[i];
			}
		}

		return answer;
	}
}