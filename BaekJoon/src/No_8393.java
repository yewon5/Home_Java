import java.util.Scanner;

public class No_8393 {
	public static void main(String[] args) {
		// TODO 8393번 합
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}