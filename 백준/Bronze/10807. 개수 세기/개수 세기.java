import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			if(Integer.parseInt(st.nextToken()) == T)
				count += 1;
		}
		System.out.println(count);
		br.close();
	}

}
