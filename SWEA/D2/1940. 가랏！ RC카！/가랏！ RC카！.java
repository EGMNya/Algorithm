import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		
		for(int t=1; t<=T; t++) {
			st = new StringTokenizer(br.readLine());
			int repeat = Integer.parseInt(st.nextToken());
			int ver = 0;
			int distance = 0;
			
			for(int i=0; i<repeat; i++) {
				st = new StringTokenizer(br.readLine());
				int command = Integer.parseInt(st.nextToken());
				if(command == 1) {
					ver += Integer.parseInt(st.nextToken());
				}else if(command == 2) {
					if(ver == 0 ) ver =0;
					else ver-= Integer.parseInt(st.nextToken());
				}
				distance +=ver;
			}
			
			System.out.println("#" + t + " "+ distance);
		}

	}
}
