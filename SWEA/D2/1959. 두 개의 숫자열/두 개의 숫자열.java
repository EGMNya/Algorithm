
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
			int[] A = new int[Integer.parseInt(st.nextToken())];
			int[] B = new int[Integer.parseInt(st.nextToken())];
			
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<A.length; i++) {
				A[i] = Integer.parseInt(st.nextToken());
			}
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<B.length; i++) {
				B[i] = Integer.parseInt(st.nextToken());
			}
			
			int tmp = 0;
			if(A.length >= B.length) {
				int num = A.length - B.length +1;
				for(int i=0; i<num; i++) {
					int val = 0;
					for(int j=0; j<B.length; j++) {
						val += B[j] * A[i+j];
					}
					//System.out.println("t" + t + " "+val);
					tmp = Math.max(tmp, val);
				}
			}else if(A.length < B.length) {
				int num = B.length - A.length +1;
				for(int i=0; i<num; i++) {
					int val = 0;
					for(int j=0; j<A.length; j++) {
						val += B[i+j] * A[j];
					}
					//System.out.println("t" + t + " "+val);
					tmp = Math.max(tmp, val);
				}
			}
			
			System.out.println("#"+ t + " "+ tmp);
		}
			
	}
}
