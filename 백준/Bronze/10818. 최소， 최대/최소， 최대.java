import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int arr[] = new int[N];
		
		for(int i=0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		br.close();
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0; i < arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
			else if(arr[i] < min)
				min = arr[i];
		}
		
		System.out.println(min + " " + max);
	}

}
