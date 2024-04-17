import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Solution{
    public static void main(String[] args) throws IOException {
        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>(100);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            int num = Integer.parseInt(br.readLine());
            int max = 0;
            int result = 0;

            for(int j=0; j<1000; j++) {
                hashmap.put(j, 0);
            }
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<1000; j++){
                int score = Integer.parseInt(st.nextToken());
                int score_cnt = hashmap.get(score);
                hashmap.replace(score, ++score_cnt);

                if(score_cnt >= max){
                    max = score_cnt;
                    result = score;
                }
            }

            
            System.out.println("#"+num+ " "+result);
        }
    }
}
