import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Queue<Integer> que = new LinkedList<>();

        for(int i=1; i<N+1; i++){
            que.offer(i);
        }

        while(!que.isEmpty()){

            if(que.size()==1) break;
            if(que == null) break;

            que.remove();
            int num = que.poll();
            que.offer(num);
        }

        System.out.println(que.peek());
    }
}
