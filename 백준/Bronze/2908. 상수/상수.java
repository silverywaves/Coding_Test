import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		br.close();
		
		// arr[0] (첫 번째 숫자)을 뒤집은 후 정수로 변환하여 변수 A에 저장
		// 입력된 각 숫자는 StringBuilder를 사용하여 뒤집기
		// append()로 문자열을 추가, reverse()로 순서를 반전, toString()으로 String 객체로 변환
		// Integer.parseInt()를 사용하여 정수로 변환
		int A = Integer.parseInt(new StringBuilder().append(arr[0]).reverse().toString());
		// arr[1] (두 번째 숫자)을 뒤집은 후 정수로 변환하여 변수 A에 저장
		int B = Integer.parseInt(new StringBuilder().append(arr[1]).reverse().toString());
		
		System.out.print(A>B?A:B);
	}	

}
