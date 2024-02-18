import java.util.Scanner;

public class No_11382 {
    public static void main(String[] args) {
    	// TODO 11382번 꼬마 정민 
    	//첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 10의12승)이 공백을 사이에 두고 주어진다.
        Scanner sc = new Scanner(System.in);
        
        long a = sc.nextLong(); //문제가 10의12승까지 입력이라 int형이 아닌 long형으로 선언해야 한다.
        long b = sc.nextLong(); //nextInt()도 nextLong()으로 바꾼다.
        long c = sc.nextLong();
        
        System.out.println(a+b+c);
    }
}

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_11382 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String str = br.readLine();
    	
    	StringTokenizer st = new StringTokenizer(str, " "); //
    	long a = Integer.parseInt(st.nextToken()); //st.nextToken()
    	long b = Integer.parseInt(st.nextToken());
    	long c = Integer.parseInt(st.nextToken());
    	
    	System.out.println(a+b+c);
    }
}
*/