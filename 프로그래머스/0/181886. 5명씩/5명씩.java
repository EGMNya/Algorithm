class Solution {
    public String[] solution(String[] names) {
        String[] answer = new String[(names.length+4)/5];
        int cnt=0;
        for(int i=0; i<names.length; i++){
            if(i%5==0) answer[cnt++] = names[i];
        }
        return answer;
    }
}