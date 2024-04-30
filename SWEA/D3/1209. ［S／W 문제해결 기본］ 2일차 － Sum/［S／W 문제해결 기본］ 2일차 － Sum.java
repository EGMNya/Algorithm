import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] arr = new int[100][100];
        int[] row_sum_arr;
        int[] col_sum_arr;
        int cnt =0;

        
        while (cnt<10){
            int T = Integer.parseInt(br.readLine());

            row_sum_arr = new int[100];
            col_sum_arr = new int[100];
            int LeftToRight = 0;
            int RightToLeft = 0;

            for(int i=0; i<100; i++){
                st = new StringTokenizer(br.readLine());
                for(int j=0; j<100; j++){
                    //String str = st.nextToken();
                    arr[i][j] = Integer.parseInt(st.nextToken());
                    row_sum_arr[i] += arr[i][j];
                    if(i==j) LeftToRight += arr[i][j];
                }
            }

            int low = 99;
            for(int i=0; i<100; i++){
                for(int j=0; j<100; j++){
                    col_sum_arr[i] += arr[j][i];
                }
                if(low >= 0) RightToLeft += arr[i][low--];
            }

            int r =0;
            int c = 0;
            int max1 = Math.max(LeftToRight, RightToLeft);
            int max2 = 0;

            for(int i=0; i<100; i++){
                r = Math.max(r, row_sum_arr[i]);
                c = Math.max(c, col_sum_arr[i]);
            }
            max2 = Math.max(r,c);

            System.out.println("#"+ T + " " + Math.max(max1,max2));
            cnt++;
        }
    }
}
