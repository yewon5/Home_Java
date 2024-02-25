import java.util.Scanner;

public class Day2_03 {
	public static void main(String[] args) {
		// TODO 문자열 돌리기
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

       	for(int i = 0; i<a.length(); i++) {
       		System.out.println(a.charAt(i));
       		
       	//문자열을 배열로 변환한 후 for-each 루프를 사용하여 각 문자에 하나씩 접근한다.
        //for (char ch : a.toCharArray())
       	//	System.out.println(ch);
       	}
    }
}
