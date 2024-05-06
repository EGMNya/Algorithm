import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		
		for(int t=1; t<=T; t++) {
			int[][] arr = new int[9][9];
			int row = 0;
			int col = 0;
			int box = 0;
			int result = 1;
			
			for(int i=0; i<9; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0; j<9; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			for(int i=0; i<9; i++) {
				row = 0;
				col = 0;
				box = 0;
				for(int j=0; j<9; j++) {
					row += arr[i][j];
					col += arr[j][i];
				}
				
				int box_n = i/3;
				box_n = box_n*3;
				for(int j=box_n; j<(box_n+3); j++) {
					for(int k=box_n; k<(box_n+3); k++) {
						box += arr[j][k];
					}
				}
				
				if (row != 45 || col != 45 || box != 45) {
					result = 0;
					
				}
			}
			
			System.out.println("#"+t+" "+ result);
		}
		
	}

}
