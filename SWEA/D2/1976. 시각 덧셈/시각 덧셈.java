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
			st = new StringTokenizer(br.readLine());
			int start_time = Integer.parseInt(st.nextToken());
			int start_min = Integer.parseInt(st.nextToken());
			int end_time = Integer.parseInt(st.nextToken());
			int end_min = Integer.parseInt(st.nextToken());
			
			int min = start_min + end_min;
			int minTotime = min/60;
			min = min%60;
			
			int time = start_time + end_time + minTotime;
			if((time/12)==2) time = 12;
			else if((time/12) > 0) time = time%12;
			//else time = time/12;
			
			System.out.println("#"+t+" "+time+ " "+ min);
		}
	}

}
