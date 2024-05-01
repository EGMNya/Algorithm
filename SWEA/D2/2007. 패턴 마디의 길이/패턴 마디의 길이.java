import java.util.Scanner;

public class Solution {
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++){
            String a=sc.next();
            for(int i=1;i<=a.length();i++){
                String b=a.substring(0,i);
                String c=a.substring(i,i+i);
                if(b.equals(c)) {
                    System.out.println("#" + test_case + " " + b.length());
                    break;
                }
            }
        }
    }
}
