import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    static ArrayList<Integer> eachHome = new ArrayList<>();
    static boolean[][] visited;
    static int[][] map;
    static int N;
    static int home;
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        visited = new boolean[N][N];
        map = new int[N][N];

        for(int i=0; i<N; i++){
            String s = br.readLine();
            char[] charArr = s.toCharArray();
            for(int j=0; j<N; j++){
                map[i][j] = charArr[j]-48;
            }
        }
        int cnt=0;

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(visited[i][j]==false && map[i][j]==1){
                    cnt++;
                    home = 0;
                    search(i,j);
                    eachHome.add(home);
                }
                visited[i][j]=true;
            }
        }

        Collections.sort(eachHome);
        System.out.println(cnt);
        for(int i : eachHome){
            System.out.println(i);
        }
    }

    private static void search(int x, int y){
       visited[x][y]=true;
       home++;
       for(int i=0; i<4; i++){
           int nx = dx[i] + x;
           int ny = dy[i] + y;

           if(nx<N && nx>=0 && ny<N && ny>=0){
               if(visited[nx][ny]==false && map[nx][ny]==1){
                   search(nx,ny);
               }
           }
       }
    }
}
