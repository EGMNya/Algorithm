import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main {
    static ArrayList<Integer>[] inList;
    static boolean visited[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int Vert = Integer.parseInt(st.nextToken());
        int Edge = Integer.parseInt(st.nextToken());
        inList = new ArrayList[Vert+1]; //0번은 쓰지 않기 위해서
        visited = new boolean[Vert+1];

        //인접리스트 만들기
        for(int i=1; i<Vert+1; i++){
            inList[i] = new ArrayList<Integer>();
        }

        //인접리스트에 노드 값 넣기
        for(int i=0; i<Edge; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            inList[end].add(start);
            inList[start].add(end);
        }

        int cnt=0;
        for(int i=1; i<Vert+1; i++){
            if(!visited[i]){
                cnt++;
                DFS(i);
            }
        }
        System.out.println(cnt);
    }

    private static void DFS(int n){
        if(visited[n]){
            return;
        }
        visited[n] = true;
        for(int i : inList[n]){
            if(!visited[i]){
                DFS(i);
            }
        }
    }
}
