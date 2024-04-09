class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        int my_leng = my_string.length();
        int over_leng = overwrite_string.length();
        int e = s + over_leng;
        String answer = my_string.substring(0,s) + overwrite_string + my_string.substring(e,my_leng);
        return answer;
    }
}