import java.util.Scanner;

public class No_2739 {
	public static void main(String[] args) {
		// TODO 2739번 구구단
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}
}