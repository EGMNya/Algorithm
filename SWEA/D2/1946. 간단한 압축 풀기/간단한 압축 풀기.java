import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		
		for(int t=1; t<=T; t++){
			st = new StringTokenizer(br.readLine());
			StringBuilder sb = new StringBuilder();
			int cnt= Integer.parseInt(st.nextToken());
			for(int i=0; i<cnt; i++) {
				st = new StringTokenizer(br.readLine());
				String str = st.nextToken();
				int num = Integer.parseInt(st.nextToken());
				for(int j=0; j<num; j++) {
					sb.append(str);
				}
			}
			
			//String result = sb.toString();

			System.out.println("#"+t);
			int num = (sb.length()/10)+1;
			int start = 0;
			
			for(int i=1; i<=num; i++) {
				if(i==num) {
					System.out.println(sb.substring(start));
				}else {
					System.out.println(sb.substring(start,10*i));
				}
				start = 10*i;
			}
			 
		}
	}
}
