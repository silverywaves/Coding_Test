import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer sc = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(sc.nextToken());
		int X = Integer.parseInt(sc.nextToken());
		
		sc = new StringTokenizer(br.readLine());
		
		for(int i=1; i<=N; i++) {
			int a = Integer.parseInt(sc.nextToken());
			if(a < X) {
				System.out.print(a + " ");
			}
		}
	}

}
