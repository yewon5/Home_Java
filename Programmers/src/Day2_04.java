import java.util.Scanner;

public class Day2_04 {
	public static void main(String[] args) {
		// TODO 홀짝 구분하기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n%2==0){
            System.out.println(n + " is even");
        }else {
            System.out.println(n + " is odd");
        }
	}
}
