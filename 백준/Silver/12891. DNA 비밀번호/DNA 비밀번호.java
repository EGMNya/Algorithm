

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int myArr[]; //현재 내 부분 문자의 상태가 어떤 값을 가지고 있는지
	static int checkArr[];
	static int checkSecret; //내 부분 문자 중 몇 개가 비밀번호 조건에 만족하는지
	
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int S = Integer.parseInt(st.nextToken()); //전체 길이
		int P = Integer.parseInt(st.nextToken()); //부분 길이
		int Result = 0; //만들 수 있는 비밀번호 개수
		checkArr = new int[4];
		myArr = new int[4];
		char A[] = new char[S];
		checkSecret = 0;
		
		A = bf.readLine().toCharArray();
		st = new StringTokenizer(bf.readLine());
		for(int i=0; i<4; i++) {
			checkArr[i] = Integer.parseInt(st.nextToken());
			if(checkArr[i] == 0) {
				checkSecret++;
			}
		}
		
		//부분문자 처음 받을 때, 세팅
		for(int i=0; i<P; i++) {
			Add(A[i]);
		}
		if(checkSecret == 4) Result++;
		
		//슬라이딩 윈도우
		for(int i=P; i<S; i++) {
			int j = i - P;		//i와 j가 슬라이딩 윈도우 범위를 가지고 이동할 수 있게 함
			Add(A[i]);
			Remove(A[j]);
			
			if(checkSecret == 4) Result++;
		}
		System.out.println(Result);
		bf.close();
	}

	public static void Remove(char c) {
		switch (c) {
		case 'A' :
			if(myArr[0] == checkArr[0]) checkSecret--;
			myArr[0]--;
			break;
		case 'C' :
			if(myArr[1] == checkArr[1]) checkSecret--;
			myArr[1]--;
			break;
		case 'G' :
			if(myArr[2] == checkArr[2]) checkSecret--;
			myArr[2]--;
			break;
		case 'T' :
			if(myArr[3] == checkArr[3]) checkSecret--;
			myArr[3]--;
			break;
		}
	}

	public static void Add(char c) {
		switch (c) {
		case 'A' :
			myArr[0]++;
			if(myArr[0] == checkArr[0]) checkSecret++;
			break;
		case 'C' :
			myArr[1]++;
			if(myArr[1] == checkArr[1]) checkSecret++;
			break;
		case 'G' :
			myArr[2]++;
			if(myArr[2] == checkArr[2]) checkSecret++;
			break;
		case 'T' :
			myArr[3]++;
			if(myArr[3] == checkArr[3]) checkSecret++;
			break;
		}
		
	}
}
