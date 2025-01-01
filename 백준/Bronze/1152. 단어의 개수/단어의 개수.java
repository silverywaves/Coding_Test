import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
//		// 방법1
//		// trim()을 사용해 입력의 양쪽 공백을 제거
//		// split("\\s+")는 하나 이상의 공백을 기준으로 문자열 분리
//		String[] arr = br.readLine().trim().split("\\s+");
//		
//		// 배열 arr의 길이(요소의 개수)를 계산하여 변수 count에 저장
//		int count = arr.length;
//		
//		System.out.print(count);
		
		// 방법2
		// StringTokenizer를 사용하여 입력된 한 줄을 공백(" ")을 기준으로 분리
		// StringTokenizer는 공백이 여러 개 있더라도 빈 문자열을 제외하고 단어만 토큰으로 처리함
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		// st.countTokens()는 현재 토큰의 개수를 반환
		System.out.print(st.countTokens());
	}

}
