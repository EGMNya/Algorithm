import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int needsum = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int arr[] = new int[num];
        int temp=0;
        int cnt=0;

        for(int i=0; i<num; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=1; i<num; i++){
            for(int j=0; j<num-1; j++){
                if(arr[j]>arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int i= 0;
        int j = num-1;
        int start_index = arr[i];
        int end_index = arr[j];
        int sum = start_index + end_index;

        while(i < j){
            if(sum == needsum){
                cnt++;
                start_index = arr[++i];
                end_index = arr[--j];
                sum = start_index + end_index;

            }
            else if(sum < needsum){
                start_index = arr[++i];
                sum = start_index + end_index;
            }
            else if(sum > needsum){
                end_index = arr[--j];
                sum = start_index + end_index;
            }
        }

        System.out.println(cnt);
    }
}
