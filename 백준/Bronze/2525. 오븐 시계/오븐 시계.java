import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int t = sc.nextInt();
		
		sc.close();
		
		int totalM = h * 60 + m + t;
		
		int newH = (totalM / 60) % 24;
		int newM = totalM % 60;
		
		System.out.printf("%d %d", newH, newM);

	}
}
