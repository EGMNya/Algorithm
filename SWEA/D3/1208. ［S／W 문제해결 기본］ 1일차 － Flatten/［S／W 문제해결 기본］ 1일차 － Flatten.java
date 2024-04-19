import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for(int i=1; i<=10; i++){
            int count = Integer.parseInt(br.readLine());
            int max = 0;
            int min = 0;
            int interval = 0;
            //int[] a = new int[100];
            ArrayList<Integer> list = new ArrayList<Integer>();
            st  = new StringTokenizer(br.readLine());
            for(int j=0; j<100; j++){
                list.add(Integer.parseInt(st.nextToken()));
            }
            for(int j=0; j<count; j++){
                max = Collections.max(list);
                min = Collections.min(list);

                if((max-min) == 1) break;

                list.set(list.indexOf(max), max-1);
                list.set(list.indexOf(min), min+1);
            }

            interval = Collections.max(list) - Collections.min(list);
            System.out.println("#"+i+" "+interval);
        }
    }
}
