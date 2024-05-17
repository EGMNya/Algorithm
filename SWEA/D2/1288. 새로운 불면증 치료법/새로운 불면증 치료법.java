import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			boolean[] check = new boolean[10];
			int k=1;
			int cnt=0;
			
			while(true) {
				String multi = String.valueOf(k*N);
				char[] value = multi.toCharArray();
				for(int i=0; i<value.length; i++) {

					int number = value[i] -'0';
					if(check[number] == false) {
						cnt++;
						check[number] = true;
					}
				}
				if(cnt==10) break;
				k++;
			}
			System.out.println("#"+t+" "+ k*N);
		}
	}
}
