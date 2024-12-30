import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	
	public static void main(String[] arg) throws IOException {
		// BufferedReader 객체 생성
		// InputStreamReader 사용해 콘솔 입력을 문자 스트림으로 읽어오기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringBuilder 객체 생성
		// 문자열을 효율적으로 조작하기 위해 사용(문자열을 더하기 위해 사용)
		StringBuilder sb = new StringBuilder();

		// 사용자가 입력한 문자열을 읽어서 변수 str에 저장
		String str = br.readLine();
		
		// 소문자 알파벳 'a'부터 'z'까지 반복문 실행
		for(char c='a'; c<='z'; c++) {
			// 현재 문자 c가 입력 문자열 str에서 처음 등장하는 위치를 indexOf로 찾아 StringBuilder에 추가
			// 문자 c가 존재하지 않으면 indexOf는 -1 반환
			sb.append(str.indexOf(c)+" ");
		}
		
		// StringBuilder에 저장된 문자열 출력
		System.out.print(sb);
	}
	
}
