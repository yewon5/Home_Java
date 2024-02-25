/*
 *import java.util.Scanner;
public class p099 {

	public static void main(String[] args) {
		// TODO 혼공자 확인 문제 2번
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 수 : ");
		String strNum1 = sc.nextLine();
		
		System.out.println("두번째 수 : ");
		String strNum2 = sc.nextLine();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("덧셈 결과 : " + result);
	}
*/

import java.util.Scanner;
public class p099 {

	public static void main(String[] args) {
		// TODO 혼공자 확인 문제 3번
		Scanner sc = new Scanner(System.in);

		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름 : "); //print
		String name = sc.nextLine(); 
		System.out.print("2. 주민번호 앞6자리 : ");
		int num = sc.nextInt();
		System.out.print("전화번호 : ");
		String tel = sc.next();
		
		System.out.println("[입력한 내용]" + "\n" + name + "\n" + num  + "\n" +  tel);
	}
}


