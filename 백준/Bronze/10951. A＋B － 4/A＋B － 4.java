//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
//		Scanner sc = new Scanner(System.in);
//		
//		while(sc.hasNextInt()) {
//			int A = sc.nextInt();
//			int B = sc.nextInt();
//			
//			System.out.println(A + B);
//		}
//		sc.close();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String str;
		
		while((str = br.readLine()) != null) {
			st = new StringTokenizer(str, " ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			sb.append(A + B).append("\n");
		}
		System.out.print(sb);
	}

}
