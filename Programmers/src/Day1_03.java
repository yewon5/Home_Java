import java.util.Scanner;

public class Day1_03 {
    public static void main(String[] args) {
    	// TODO 문자열 반복해서 출력하기
    	Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
        	System.out.print(str);
        }
    } 
}