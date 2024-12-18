import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		// BufferedReader 객체 생성
		// System.in을 InputStreamReader로 감싸서 입력을 문자 형태로 변환 후 BufferedReader로 감싸서 효율적으로 처리
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		// 사용자로부터 숫자를 입력받아 int 로 변환하고, 1을 뺀 값을 n 변수에 저장(인덱스 0부터 시작)
		int n = Integer.parseInt(br.readLine())-1;
		
		br.close();
		
		// S 문자열에서 n번째(0부터 시작하는 인덱스) 문자 하나를 가져와 출력
		System.out.println(S.charAt(n));
	}

}
