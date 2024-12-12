import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		// BufferedReader: 사용자 입력을 처리하기 위해 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 첫 번째 줄의 입력을 읽고 공백으로 나누기
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 배열의 크기 N과 작업 횟수 M 입력
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		// 크기가 N인 정수 배열 생성
		int arr[] = new int[N];
		
		// 배열 초기화: 1부터 N까지의 숫자로 채우기
		for(int i=0; i<arr.length; i++) {
			arr[i] = i + 1;		// 배열의 각 인덱스에 i+1 값을 대입
		}
		
//		for(int value : arr)
//			System.out.print(value + " ");
		
		// M번 동안 입력받은 인덱스를 기준으로 배열 값을 교환
		for(int i=0; i<M; i++) {
			// 각 줄의 입력을 읽고 공백으로 나누기
			st = new StringTokenizer(br.readLine());
			int Ni = Integer.parseInt(st.nextToken())-1;	// 교환할 첫 번째 인덱스 (1-based → 0-based)
			int Nj = Integer.parseInt(st.nextToken())-1;	// 교환할 두 번째 인덱스 (1-based → 0-based)
			
			// 두 배열 값 교환 (임시 변수 사용)
			int change = arr[Ni];	// Ni 위치의 값을 임시 변수에 저장
			arr[Ni] = arr[Nj];		// Nj 위치의 값을 Ni 위치로 이동
			arr[Nj] = change;		// 임시 변수 값을 Nj 위치로 이동
		}
		
		// 최종 배열의 값 출력
		for(int value : arr)	// 향상된 for 문 => for (데이터타입 변수명 : 배열 또는 컬렉션)
			System.out.print(value + " ");	// 각 값을 공백으로 구분하여 출력
	}

}
