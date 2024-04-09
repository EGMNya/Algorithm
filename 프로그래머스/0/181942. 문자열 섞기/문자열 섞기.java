class Solution {
    public String solution(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        char a_arr[] = str1.toCharArray();
        char b_arr[] = str2.toCharArray();
        
        for(int i=0; i<a_arr.length; i++){
            sb.append(a_arr[i]);
            sb.append(b_arr[i]);
        }
        
        String answer = sb.toString();
        
        return answer;
    }
}