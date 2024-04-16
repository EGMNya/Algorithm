import java.util.Arrays;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        Arrays.sort(indices);
        int cnt =0;
        
        for(int i=0; i< my_string.length(); i++){
            if(cnt >= indices.length) {cnt = 0;}
            if(i != indices[cnt]) {
                answer += my_string.charAt(i);
            }else cnt++;
        }
        return answer;
    }
}