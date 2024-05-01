import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        char[] makeArr;

        for(int i=1; i<=N; i++){
            String str = String.valueOf(i);
            if(str.contains("3")||str.contains("6")||str.contains("9")){
                makeArr = String.valueOf(i).toCharArray();
                for(int j=0; j<makeArr.length; j++){
                    if(makeArr[j]=='3') sb.append("-");
                    else if(makeArr[j]=='6') sb.append("-");
                    else if(makeArr[j]=='9') sb.append("-");
                }
                if(i==N) sb.append(" ");
                else sb.append(" ");
            }else{
                if(i==N) sb.append(i);
                else sb.append(i+" ");
            }
        }


        System.out.println(sb.toString());
    }
}
