import java.util.Scanner;

public class Day1_04 {
    public static void main(String[] args) {
    	// TODO 대소문자 바꿔서 출력하기
        Scanner sc = new Scanner(System.in);
        String a = sc.next(); //sc.next(); 사용자로부터 문자열을 입력받아 변수 a에 저장
        String str = ""; //""; 빈 문자열을 초기화하여 대소문자가 변환된 문자열을 저장할 변수 str을 생성
        
        for(int i=0; i<a.length(); i++) {
        	char c = a.charAt(i); // 문자열 a의 i번째 인덱스에 해당하는 문자를 가져와 변수 c에 저장
        	
        	//만약 소문자라면 대문자로 변환하고, 그렇지 않으면 소문자로 변환
        	if(Character.isLowerCase(c)) { //.isLowerCase(): c가 소문자인지 여부를 확인
        		str += Character.toUpperCase(c);
        	}else {
        		str += Character.toLowerCase(c);
        	}
        }
        System.out.println(str);
    }
}