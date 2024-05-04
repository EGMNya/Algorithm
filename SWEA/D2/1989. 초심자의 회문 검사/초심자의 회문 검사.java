import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for(int i=1; i<=T; i++){
            String str = br.readLine();
            sb.setLength(0);
            sb.append(str);
            String comp = sb.reverse().toString();

            if(comp.equals(str)) System.out.println("#"+i+" 1");
            else System.out.println("#"+i+" 0");
        }
    }
}
