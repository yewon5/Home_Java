import java.util.Scanner;

public class Day2_01 {
    public static void main(String[] args) {
    	// TODO 덧셈식 출력하기
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = a + b;
        System.out.println(a + " + " + b + " = " + c);
    }
}