//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			int A = sc.nextInt();
//			int B = sc.nextInt();
//			
//			if(A == 0 && B == 0) {
//				sc.close();
//				break;
//			}
//			
//			System.out.println(A + B);
//		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer sc;
		StringBuilder sb = new StringBuilder();
		
		while(true){
			sc = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(sc.nextToken());
			int B = Integer.parseInt(sc.nextToken());
			
			if(A == 0 && B == 0) {
				break;
			}
			
			sb.append(A + B).append("\n");
		}
		System.out.println(sb);
	}

}
