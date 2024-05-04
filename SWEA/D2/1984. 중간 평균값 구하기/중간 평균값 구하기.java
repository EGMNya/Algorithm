import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());

        for(int i=1; i<=T; i++){
            int[] arr = new int[10];
            st = new StringTokenizer(br.readLine());
            int max_idx = 0;
            int max = 0;
            int min_idx = 0;
            int min = 10000;

            for(int j=0; j<10; j++){
                arr[j] = Integer.parseInt(st.nextToken());
                if(arr[j] > max) {
                    max_idx = j;
                    max = arr[j];
                }
                if(arr[j] < min) {
                    min_idx = j;
                    min = arr[j];
                }
            }

            int sum = 0;
            for(int j=0; j<10; j++){
                if(j!=max_idx && j!=min_idx){
                    sum += arr[j];
                }
            }
            double avg = (double)sum / 8;
            System.out.println("#"+i+" "+String.format("%.0f",avg));
        }
    }
}
