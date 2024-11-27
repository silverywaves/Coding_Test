import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if(N % 4 == 0) {
			for(int i=1; i*4<=N; i++) {
				System.out.print("long ");
			}
		}
		System.out.print("int");
		
		sc.close();
	}

}
