import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 사용자로부터 입력된 줄을 읽고, 정수로 변환하여 T(테스트 케이스의 수)에 저장
		int T = Integer.parseInt(br.readLine());
		
		// 테스트 케이스 수만큼 반복
		for(int i=0; i<T; i++) {
			// 한 줄을 읽고, 공백을 기준으로 분리하여 문자열 배열 str에 저장
			// 배열의 첫 번째 요소는 반복 횟수(R), 두 번째 요소는 문자열(word)
			String[] str = br.readLine().split(" ");
			
			// R : 반복 횟수, 문자열에서 몇 번 반복할지 결정
			int R = Integer.parseInt(str[0]);
			// word : 반복 대상이 되는 문자열
			String word = str[1];
			
			// 문자열의 각 문자를 처리하기 위해 반복
			for(int j=0; j<word.length(); j++) {
				// 각 문자를 R번 출력
				for(int k=0; k<R; k++) {
					// word의 j번째 문자 출력
					System.out.print(word.charAt(j));
				}
			}
			
			// 각 테스트 케이스의 결과를 출력한 뒤 줄바꿈
			System.out.println();
		}
		
		br.close();

	}

}
