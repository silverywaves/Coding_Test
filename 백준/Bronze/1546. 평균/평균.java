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
		
		// 첫 번째 입력을 정수로 변환하여 과목 수 N에 저장
		int N = Integer.parseInt(st.nextToken());
		
		// 크기가 N인 실수형 배열 arr 선언
		double arr[] = new double[N];
		// 평균(avg), 최댓값(max), 합계(sum)을 저장할 변수 선언 및 초기화
		double avg, max = 0, sum = 0;
		
		// 두 번째 입력 줄을 읽어서 공백 기준으로 나누는 StringTokenizer 객체 생성
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			// 입력된 점수를 실수로 변환하여 배열에 저장
			arr[i] = Double.parseDouble(st.nextToken());
			
			// 현재 값이 최댓값보다 크다면 최댓값(max) 갱신
			if(arr[i] > max)
				max = arr[i];
		}
		
		for(int i=0; i<arr.length; i++) {
			// 현재 점수를 최대 점수로 나눈 후 100을 곱해 새로운 점수로 변환
			arr[i] = (arr[i] / max) * 100;
			// 변환된 점수를 합계에 추가
			sum += arr[i];
		}
		
		br.close();			// 입력 스트림을 닫아 자원 해제
		
		avg = sum / N;		// 변환된 점수들의 합계(sum)를 과목 수(N)로 나누어 평균(avg) 계산
		
		System.out.print(avg);	// 최종 평균 출력
		
	}

}
