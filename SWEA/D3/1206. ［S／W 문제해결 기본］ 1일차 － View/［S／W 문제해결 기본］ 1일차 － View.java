import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        int result = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = 1;

        while(T <= 10){
            result = 0;
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<N; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }


            for(int m=2; m<N-2; m++){
                int left = arr[m] - arr[m-2];
                int right = arr[m] - arr[m+2];

                if(left > 0 && right > 0){
                    int temp = Math.min(left, right);
                    left = arr[m] - arr[m-1];
                    right = arr[m] - arr[m+1];
                    if(left>0 && right>0){
                        int temp1 = Math.min(left, right);
                        result += Math.min(temp,temp1);
                    }
                }
            }


            System.out.println("#"+T+" "+ result);
            T++;
        }
    }
}
