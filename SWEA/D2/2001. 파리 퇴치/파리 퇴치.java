import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());

        for(int i=0; i<T; i++){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int[][] arr = new int[N][N];
            int M = Integer.parseInt(st.nextToken());
            int[] dir_x = new int[M];
            int[] dir_y = new int[M];

            for(int j=0; j<N; j++){
                st = new StringTokenizer(br.readLine());
                for(int k=0; k<N; k++){
                    arr[j][k] = Integer.parseInt(st.nextToken());
                }
            }

            for(int j=0; j<M; j++){
                dir_x[j] = j;
                dir_y[j] = j;
            }

            int sum;
            int max = 0;
            for(int a=0; a<=N-M; a++){
                for(int b=0; b<=N-M; b++){
                    sum = 0;
                    for(int c=a; c<M+a; c++){
                        for(int d=b; d<M+b; d++){
                            sum += arr[c][d];
                        }
                    }
                    max = Math.max(sum, max);
                }
            }

            System.out.println("#"+(i+1)+" "+max);
        }
    }
}
