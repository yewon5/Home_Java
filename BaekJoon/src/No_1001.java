import java.util.Scanner;

public class No_1001 {
	public static void main(String[] args) {
		// TODO 1001번 A - B
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a-b);
	}
}

/*
//BufferedReader 방식
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 1001번 A - B
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		String str = br.readLine();
		
		StringTokenizer st = new StringTokenizer(str, " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		System.out.println(a-b);
	}
}
*/

/*
//split 방식
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
	public static void main(String[] args) throws IOException {
		// TODO 1001번 A - B
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		
		////배열 str에서 첫 번째와 두 번째 문자열을 각각 정수로 변환하여 변수 a와 b에 저장
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
		
		System.out.println(a-b);
	}
}
*/