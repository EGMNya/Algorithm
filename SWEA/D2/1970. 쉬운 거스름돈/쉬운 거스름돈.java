import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T = sc.nextInt();
		
		for(int t=1; t<=T; t++) {
			int value = sc.nextInt();
			int mok = 0;
			sb.setLength(0);
			
			int div = 50000;
			for(int i=0; i<8; i++) {
				mok = value/div;
				value = value%div;
				sb.append(mok+" ");
				
				if(i%2==0) div = div/5;
				else div = div/2;
			}
			
			System.out.println("#"+t);
			System.out.println(sb.toString());
			
		}
	}
}
