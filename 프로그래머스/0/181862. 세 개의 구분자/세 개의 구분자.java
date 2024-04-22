import java.util.ArrayList;
class Solution {
    public String[] solution(String myStr) {
        String[] answer;
        ArrayList<String> myans = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<myStr.length(); i++){
            String str = String.valueOf(myStr.charAt(i));
            if(str.equals("a")||str.equals("b")||str.equals("c")){
                if(sb.length() != 0){
                    myans.add(sb.toString());
                    sb.setLength(0);
                }
            }else if(i==(myStr.length()-1)){
                sb.append(str);
                myans.add(sb.toString());
            }else{
                sb.append(str);
            }
        }
        if(myans.isEmpty()) return answer = new String[] {"EMPTY"};
        answer = myans.toArray(new String[myans.size()]);
        return answer;
    }
}