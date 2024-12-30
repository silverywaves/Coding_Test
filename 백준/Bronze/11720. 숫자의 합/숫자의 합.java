import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		// BufferedReader 객체 생성
		// InputStreamReader 사용해 콘솔 입력을 문자 스트림으로 읽어오기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 첫 번째 입력을 읽어 정수형으로 변환하여 변수 N(입력받을 숫자의 개수)에 저장
		int N = Integer.parseInt(br.readLine());
		
		// 두 번째 입력을 읽어 문자열로 저장하고, 각 문자를 분리하여 문자열 배열 `str`에 저장
		// `split("")`은 문자열을 문자 하나씩 잘라 배열 생성
		String[] str = br.readLine().split("");
		
		 // BufferedReader를 닫아 자원을 해제
		br.close();
		
		// 합계를 저장할 변수 `sum`을 선언하고 0으로 초기화
		int sum = 0;
		
		// 0부터 `N-1`까지 반복문 실행: 입력받은 숫자들의 합을 계산
		for(int i=0; i<N; i++) {
			// `str[i]`를 정수로 변환하여 `sum`에 더하기
			sum += Integer.parseInt(str[i]);
		}
		
		// 계산된 합계 출력
		System.out.print(sum);
	}

}
