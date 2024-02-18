import java.util.Scanner; //Scanner 사용자 입력을 받기 위해서

public class No_1000 {
	public static void main(String[] args) {
		// TODO 1000번 A + B
		Scanner sc = new Scanner(System.in); //(System.in)은 키보드로부터 사용자 입력을 읽는 데 사용
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a+b);
	}
}

/*
//BufferedReader
import java.io.BufferedReader; //표준 입력 스트림(System.in)으로부터 데이터를 읽기 위해 사용
import java.io.IOException; //입출력 작업 중 발생할 수 있는 예외를 처리하기 위한 클래스
import java.io.InputStreamReader; //바이트 기반 InputStream을 문자 기반 Reader로 변환하는 역할. (System.in)으로부터 데이터를 읽기 위해 사용
import java.util.StringTokenizer; //주어진 문자열을 특정 구분자로 구분하여 여러 부분 문자열로 나누고, 각 부분 문자열에 대한 반복 작업을 수행할 때 유용.

public class No_1000 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(); //readLine()은 BufferedReader 클래스에 속한 메서드로, 입력 스트림에서 한 줄을 읽어오는 역할
        
        StringTokenizer st = new StringTokenizer(str, " "); //str 문자열을 공백을 기준으로 분리하여 토큰(token)으로 만든다.
        int a = Integer.parseInt(st.nextToken()); //다음 토큰을 반환
        int b = Integer.parseInt(st.nextToken());
        
        System.out.println(a+b);
    }
}
*/

/*
//split
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1000 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" "); //split(" ")을 통해 공백을 기준으로 분할한 후, 이를 문자열 배열 str에 저장
        
        //배열 str에서 첫 번째와 두 번째 문자열을 각각 정수로 변환하여 변수 a와 b에 저장
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        
        System.out.println(a+b);
    }
}
*/