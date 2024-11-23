import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		sc.close();
		
		int cg = M - 45;
		
		if(cg < 0)
			if(H != 0)
				System.out.printf("%d %d", (H-1), (60+cg));
			else {
				H = 23;
				System.out.printf("%d %d", H, (60+cg));
			}
		else
			System.out.printf("%d %d", H, cg);
	}
}
