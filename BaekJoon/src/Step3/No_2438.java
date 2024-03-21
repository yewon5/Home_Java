package Step3;
import java.util.Scanner;

public class No_2438 {
	public static void main(String[] args) {
		// TODO 2438번 별 찍기 - 1
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
	}
}
