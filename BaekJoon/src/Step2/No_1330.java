package Step2;
import java.util.Scanner;

public class No_1330 {
	public static void main(String[] args) {
		// TODO 1330번 두 수 비교하기
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt(); 
        int b = sc.nextInt();
        
        if(a > b) {
        	System.out.println(">");
        }else if(a<b) {
        	System.out.println("<");
        }else if(a==b) {
        	System.out.println("==");
        }
    }
}
