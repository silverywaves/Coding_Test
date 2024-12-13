import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arr[] = new int[10];	// 10개의 정수를 저장할 배열
		int com[] = new int[42];	// 0부터 41까지의 나머지를 저장할 배열
		int count = 0, num = 0;		// count : 유일한 나머지의 개수, num : 나머지 계산을 위한 변수
		
		Arrays.fill(com, 0);		// com 배열을 0으로 초기화. 0은 해당 나머지가 아직 나와지지 않았음을 의미
		
		// 10개의 숫자 입력받고 나머지 계산
		for(int i=0; i<arr.length; i++){	// 10번 반복
			arr[i] = Integer.parseInt(br.readLine());	// 사용자로부터 입력받은 값을 정수로 변환하여 arr 배열에 저장
			num = arr[i] % 42;		// 입력받은 숫자에서 42로 나눈 나머지 계산
			
			com[num] = num + 1; 	// 해당 나머지 값의 위치를 1로 표시 (이미 해당 나머지가 나타났음을 기록)
		}
		
		// 중복된 나머지 값이 몇 개 있는지 계산
		for(int i=0; i<com.length; i++) {	// com 배열의 모든 요소를 반복하여 검사
			if(com[i] != 0) 		// com 배열의 값이 1이면, 해당 나머지는 한 번 이상 나온 값
				count++;			// count를 1 증가시켜 유일한 나머지의 개수를 셈
		}
		br.close();
		
		System.out.println(count);	// 유일한 나머지의 개수를 출력
	}

}
