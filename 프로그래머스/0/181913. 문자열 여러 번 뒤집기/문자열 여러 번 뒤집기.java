class Solution {
    public String solution(String my_string, int[][] queries) {
        String[] myArr = my_string.split("");
        String myStr = my_string;

        for(int i=0; i<queries.length; i++){
            int start = queries[i][0];
            int end = queries[i][1];
            int bound = end - start;
            for(int j=0; j<bound+1; j++){
                char a = myStr.charAt(end-j);
                myArr[start+j] = String.valueOf(a);
            }
            myStr = String.join("",myArr);
        }
        return String.join("",myArr);
    }
}