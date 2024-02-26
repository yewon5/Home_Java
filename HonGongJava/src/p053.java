public class p053 {
	public static void main(String[] args) {
		// TODO 혼공자 변수 사용
		
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간 " + minute + "분"); //3시간 5분
		
		int totalTime = (hour*60) + minute;
		System.out.println("총 " + totalTime + "분"); //총 185분
	}
}
