import java.util.stream.Collectors;
import java.util.*;

class Solution {
    public String solution(String my_string) {
          String[] arr = my_string.toLowerCase().split("");
        return Arrays.stream(arr).sorted().collect(Collectors.joining());
    }
}