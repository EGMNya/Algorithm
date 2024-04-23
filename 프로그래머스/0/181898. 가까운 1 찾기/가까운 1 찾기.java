import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int solution(int[] arr, int idx) {
        List<Integer> list = new ArrayList<Integer>();
        list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        
        for(int i=idx; i<arr.length; i++){
            if(list.get(i).equals(1)){
                return i;
            }
        }
        return -1;
    }
}