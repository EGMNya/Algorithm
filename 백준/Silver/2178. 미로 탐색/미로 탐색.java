import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};
    static boolean[][] visited;
    static int[][] map;
    static int N,M;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new boolean[N][M];
        map = new int[N][M];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            for(int j=0; j<M; j++){
                map[i][j] = Integer.parseInt(s.substring(j,j+1));
            }
        }

        BFS(0,0);
        System.out.println(map[N-1][M-1]);
    }

    private static void BFS(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        //큐는 linkedlist를 이용해서 생성해야 한다.

        //값을 추가하려면 add(), offer()를 사용
        // (add는 성공하면 true, 실패하면 Exception)
        // (offer는 성공하면 true, 실패하면 false)

        //값 삭제는 poll(), remove()
        // (poll은 반환, 함수가 비어있으면 null반환)
        // (remove는 반환값, 함수가 비어있으면 Exception)

        //peek()은 첫번째 값 참조

        queue.offer(new int[]{x,y});
        while(!queue.isEmpty()){
            int now[] = queue.poll(); //현재의 자리 뽑아넣기
            visited[x][y] = true;
            for(int i=0; i<4; i++){
                int nx = dx[i] + now[0];
                int ny = dy[i] + now[1];

                if(nx >= 0 && ny>=0 && nx<N && ny<M){
                    if(!visited[nx][ny] && map[nx][ny] != 0){
                        visited[nx][ny] = true;
                        map[nx][ny] = map[now[0]][now[1]]+1;
                        queue.add(new int[] {nx,ny});
                    }
                }
            }
        }

    }
}
