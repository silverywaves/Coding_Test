import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int Ni, Nj, k = 0;
		
		int arr[] = new int[N];
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			Ni = Integer.parseInt(st.nextToken())-1;
			Nj = Integer.parseInt(st.nextToken())-1;
			k = Integer.parseInt(st.nextToken());
			
			for(int j=Ni; j<=Nj; j++) {
				arr[j] = k;
			}
		}
		br.close();
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
