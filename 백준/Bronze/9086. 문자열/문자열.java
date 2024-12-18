import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 처리할 문자열의 개수를 정수로 입력 받아 T 변수에 저장
		int T = Integer.parseInt(br.readLine());
		
		// 결과를 저장하기 위해 크기가 T인 문자열 배열 arr 선언
		String arr[] = new String[T];
		
		
		for(int i=0; i<T; i++) {	// T번 반복하여 각 문자열을 입력받아 처리
			// 사용자로부터 문자열을 입력받아 str 변수에 저장
			String str = br.readLine();
			// 입력받은 문자열 str 에서 첫 번째 문자와 마지막 문자를 추출하여 결합한 후 arr[i] 에 저장
			// `substring(0, 1)`은 첫 번째 문자, `substring(str.length() - 1, str.length())`는 마지막 문자
			arr[i] = str.substring(0, 1) + str.substring(str.length()-1, str.length());
		}
		
		br.close();
		
		for(String value : arr)
			System.out.println(value);
		
	}

}

// 1. String substring(int index) : String의 index번째 값부터 끝까지 출력
//	String str = "abcdefgh"		-결과->		str.substring(3) > defgh
//
// 2. String substring(int beginIndex, int endIndex) : String의 beginIndex번째 값부터 (endIndex-1)번째 값까지 출력
//	String str = "abcdefgh"		-결과->		str.substring(3,6) > def



