import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int x=0; x<N; x++) {
			for(int y=0; y<=x; y++) {
				System.out.print("*");
			}
			System.out.print(" \n");
		}
	}

}