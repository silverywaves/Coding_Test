import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		// 표준 입력을 받을 BufferedReader 객체 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 첫 번째 입력 줄을 읽어서 공백을 기준으로 나누는 StringTokenizer 객체 생성
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 첫 번째 토큰을 정수로 변환해 배열 크기 N에 저장
		int N = Integer.parseInt(st.nextToken());
		// 두 번째 토큰을 정수로 변환해 뒤집기 작업 횟수 M에 저장
		int M = Integer.parseInt(st.nextToken());
		
		// 배열 요소를 교환할 때 임시로 값을 저장할 변수 선언 및 초기화
		int temp = 0;
		
		// 크기가 N인 정수형 배열 arr 선언
		int arr[] = new int[N];
		// 배열 arr 초기화 -> 1부터 N까지의 숫자로 배열을 채움
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		for(int i=0; i<M; i++) {	// M번의 작업을 반복
			// 새로운 입력 줄을 읽고 StringTokenizer 객체로 나눔
			st = new StringTokenizer(br.readLine());
			// 입력된 시작 인덱스를 0 기반으로 변환
			int ni = Integer.parseInt(st.nextToken())-1;
			// 입력된 종료 인덱스를 0 기반으로 변환
			int nj = Integer.parseInt(st.nextToken())-1;
			
			while(ni<nj) {				// 시작 인덱스와 종료 인덱스가 교차할 때까지 반복
				temp = arr[ni];			// 시작 인덱스의 값을 temp 에 저장
				arr[ni] = arr[nj];		// 종료 인덱스의 값을 시작 인덱스에 저장
				arr[nj] = temp;			// temp 에 저장된 값을 종료 인덱스에 저장(교환)
				ni++;					// 시작 인덱스 증가
				nj--;					// 종료 인덱스 감소
			}
		}
		br.close();		// 입력 스트림을 닫아 자원 해제
		
		// 배열의 모든 값 출력
		for(int value : arr)
			System.out.print(value + " ");
	}

}
