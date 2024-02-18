import java.util.Scanner;

public class No_18108 {
    public static void main(String[] args) {
    	// TODO 18108번 1998년생인 내가 태국에서는 2541년생?!
        Scanner sc = new Scanner(System.in);
        
        int year = sc.nextInt();
        
        System.out.println(year - 543);
    }
}

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine(); //int → String 타입으로 선언
		int year = Integer.parseInt(str); //문자열 → 정수타입으로 변환 
		
		System.out.println(year - 543);
	}
}
*/