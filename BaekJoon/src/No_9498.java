import java.util.Scanner;

public class No_9498 {
	public static void main(String[] args) {
		// TODO 9498번 시험 성적
        Scanner sc = new Scanner(System.in);
        
        int score = sc.nextInt(); 

        if(score >= 90) {
            System.out.println("A");
        } else if(score >= 80) {
            System.out.println("B");
        } else if(score >= 70) {
            System.out.println("C");
        } else if(score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
