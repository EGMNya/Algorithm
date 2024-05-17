import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringBuilder result = new StringBuilder();
		
		int T = Integer.parseInt(st.nextToken());
		for(int t=1; t<=T; t++) {
			st = new StringTokenizer(br.readLine());
			char[] input = st.nextToken().toString().toCharArray();
			sb.setLength(0);
			result.setLength(0);
			
			for(int i=0; i<input.length; i++) {
				int cToInt = change_toInt(input[i]);
				String tmp = Integer.toBinaryString(cToInt);
				while(tmp.length() < 6) {
					tmp = "0"+tmp;
				}
				sb.append(tmp);
			}
			int mok = sb.length()/8;
			int[] val_int = new int[mok+1];
			String val_str = sb.toString();
			int start =0;
			
			for(int i=1; i<=mok; i++) {
				String str ="";
				if(i==mok) {
					str = val_str.substring(start);
				}
				else str = val_str.substring(start, 8*i);
				val_int[i] = Integer.parseInt(str,2);
				start = 8*i;
			}
			
			for(int i=1; i<val_int.length; i++) {
				result.append((char)val_int[i]);
			}
			System.out.println("#"+t+ " "+result.toString());
			
		}
	}
	public static int change_toInt(char c) {
		int number = 0;
		char[] dec= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
				'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
				'0','1','2','3','4','5','6','7','8','9','+','/'};
		for(int i=0; i<dec.length; i++) {
			if(dec[i] == c) {
				number = i;
				break;
			}
		}
		return number;
	}
}
