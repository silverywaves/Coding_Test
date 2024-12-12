import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int member[] = new int[30];
		int submit[] = new int[28];
		
		// 결과를 저장할 리스트
		List<Integer> result = new ArrayList<>();
		
		for(int i=0; i<member.length; i++)
			member[i] = i + 1;
		
//		for(int value : member) {
//			System.out.println(value + " ");
//		}
		
		// submit 배열 입력 받기
		for(int i=0;i<submit.length;i++) {
			int clear = Integer.parseInt(br.readLine());
			submit[i] = clear;
		}
		
//		for(int value : submit) {
//			System.out.print(value + " ");
//		}
		
		// member 배열에 없는 값을 찾아 result 리스트에 추가
		for(int value : member) {			// member 배열의 각 요소(value)를 하나씩 순회
			boolean isSubmitted = false;	// submit 배열에 현재 value가 포함되었는지 체크할 플래그 변수
			// 처음에는 false로 설정 => value가 submit 배열에 없다고 가정하고 시작
			
			// submit 배열에 value 가 존재하는지 확인
			for(int submitValue : submit) {	// submittedValue는 submit 배열의 각 값을 나타냄
				if(value == submitValue) {	// 만약 submit 배열에 value와 일치하는 값이 있다면
					isSubmitted = true;		// value가 submit 배열에 존재하므로 isSubmitted를 true로 설정
					break;					// submit 배열에서 value를 찾았으므로 더 이상 검색할 필요 없이 빠져나오기
				}
			}
			
			// submit 에 없는 값만 result 에 추가
			if(!isSubmitted)		// 만약 value가 submit 배열에 없으면
				result.add(value);	// value를 result 리스트에 추가
		}
		
		for(int value : result)
			System.out.println(value);
	}

}
