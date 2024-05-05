

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());

		String[] grade = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-","D0"};
		
		
		for(int i=1; i<=T; i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int mok = N/10;
			double[] score = new double[N];
			
			int k = Integer.parseInt(st.nextToken());
			double target = 0;
			
			for(int j=0; j<N; j++) {
				st = new StringTokenizer(br.readLine());
				double mid = Double.valueOf(st.nextToken());
				double last = Double.valueOf(st.nextToken());
				double task = Double.valueOf(st.nextToken());
				
				double total = (mid*0.35) + (last*0.45) + (task*0.2);
				score[j] = total;
				if(k==(j+1)) {
					target = total;
				}
			}
			
			Arrays.sort(score);
			
			double[] score_sort = new double[N];
			int cnt =0;
			for(int j=N-1; j>=0; j--) {
				score_sort[cnt++] = score[j];
			}
			
			
			for(int j=0; j<N; j++) {
				if(score_sort[j]==target) {
					int calc_mok = j/mok;
					String result = grade[calc_mok];
					System.out.println("#"+i+" "+result);
				}
			}
		}
	}

}
