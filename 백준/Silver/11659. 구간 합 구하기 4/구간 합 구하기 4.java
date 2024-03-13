import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int quizNum = Integer.parseInt(st.nextToken());

        long[] s = new long[num + 1];           //0번째 인덱스는 신경쓰지 않기 위해서 +1해줌

        st = new StringTokenizer(br.readLine());
        for(int i=1; i<num+1; i++){               //마찬가지로 0번재 인덱스는 신경쓰지 않으려고 1부터 시작
            s[i] = s[i-1] + Integer.parseInt(st.nextToken());
        }

        for(int q=0; q<quizNum; q++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(s[j]-s[i-1]);
        }
    }
}
