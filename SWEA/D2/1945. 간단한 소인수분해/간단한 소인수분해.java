import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] num = {2,3,5,7,11};
		
		for(int t=1; t<=T; t++) {
			int val = sc.nextInt();
			int c = 0;
			int[] res = {0,0,0,0,0};
			
			while(true) {
				if(val==num[c]) {
					res[c] += 1;
					break;
				}
				if(val % num[c] == 0) {
					res[c] += 1;
					val = val/num[c];
				}else 
					c++;
			}
			
			System.out.print("#"+t);
			for(int i=0; i<res.length; i++) {
				System.out.print(" "+ res[i]);
			}
			System.out.println();
		}
	}
}
