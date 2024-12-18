import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	
	public static void main(String[] arg) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();
		
		// 입력받은 문자열의 길이를 계산하여 화면에 출력
		// `length()` 메서드 : 문자열의 길이를 반환
		System.out.println(str.length());
	}

}
