import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int arr[] = new int[N];
        int num = 1;

        for(int i=1; i<N+1; i++){
            if(N%i == 0) {
                arr[num++] = i;
            }
        }
        if(num<K) arr[K] = 0;

        System.out.println(arr[K]);
    }
}
