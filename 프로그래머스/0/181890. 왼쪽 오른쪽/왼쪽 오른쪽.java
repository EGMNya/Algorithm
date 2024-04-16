import java.util.Arrays;
class Solution {
    public String[] solution(String[] str_list) {
        StringBuilder sb = new StringBuilder();
        String[] noAnswer = {};
        boolean check = true;
        
        for(int i=0; i<str_list.length; i++){
            if(str_list[i].equals("l") && check) {
                if(i==0) return noAnswer;
                break;
            }
            
            sb.append(str_list[i]);
            
            if(str_list[i].equals("r") && check){
                if(i==(str_list.length-1)) return noAnswer;
                sb.setLength(0);
                check = false;
            }
            
        }
        
        String str = sb.toString();
        
        if(str.length() == str_list.length) return noAnswer;
    
        String[] answer = str.split("");
        return answer;
    }
}