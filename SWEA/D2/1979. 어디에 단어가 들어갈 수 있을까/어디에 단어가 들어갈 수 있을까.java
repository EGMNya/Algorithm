
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();
		
		int T = Integer.parseInt(st.nextToken());
		for(int t=1; t<=T; t++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			String[][] arr = new String[N][N];
			int K = Integer.parseInt(st.nextToken());
			
			int result = 0;
			
			
			for(int i=0; i<N; i++) {
				sb.setLength(0);
				st = new StringTokenizer(br.readLine());
				for(int j=0; j<N; j++) {
					arr[i][j] = st.nextToken();
					sb.append(arr[i][j]);
				}
				
				String[] tmp  = sb.toString().split("0");
				for(int j=0; j<tmp.length; j++) {
					if(tmp[j].length()==K) result++;
				}
			}
			
			for(int i=0; i<N; i++) {
				sb.setLength(0);
				for(int j=0; j<N; j++) {
					sb.append(arr[j][i]);
				}
				String[] tmp  = sb.toString().split("0");
				
				for(int j=0; j<tmp.length; j++) {
					if(tmp[j].length()==K) result++;
				}
			}
			
			System.out.println("#"+t+" "+result);
			
		}
	}
}
