
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Queue<Integer> q = new LinkedList<Integer>();
		
		int back = 0;
		int N = Integer.parseInt(st.nextToken());

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken();

			switch (s) {
			case "push":
				int n = Integer.parseInt(st.nextToken());
				q.offer(n);
				back = n;
				break;

			case "pop":
				if (q.peek() == null) sb.append("-1\n");
				else sb.append(q.poll()+"\n");
				break;

			case "size":
				sb.append(q.size() + "\n");
				break;

			case "empty":
				if (q.peek() == null) sb.append("1\n");
				else sb.append("0\n");
				break;

			case "front":
				if (q.peek() == null) sb.append("-1\n");
				else sb.append(q.peek()+"\n");
				break;

			case "back":
				if (q.peek() == null) sb.append("-1\n");
				else sb.append(back + "\n");
				break;

			default:
				break;
			}
		}
		System.out.println(sb);
	}
}
