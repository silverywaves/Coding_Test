import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		sc.close();
		
		if(a == b && b == c && a == c){
			System.out.println(10000 + a * 1000);
		} else if(a == b || a == c || b == c) {
			int same = (a == b || a == c) ? a : b; 
			System.out.println(1000 + same * 100);
		} else {
			int max = Math.max(a, Math.max(b, c));
			System.out.println(max * 100);
		}
	}

}
