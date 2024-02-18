public class p074 {
	public static void main(String[] args) {
		// TODO 혼공자 자동 타입 변환
		
		//작은 범위 → 큰 범위는 자동으로 타입 변환된다.	
		//byte < short < int < float < double 
		byte byteV=10;
		int intV=byteV;
		System.out.println("intV : " + intV);

		char charV='가';
		intV=charV;
		System.out.println("가의 유니코드 : " + intV);
		
		intV=50;
		long longV=intV;
		System.out.println("longV : " + longV);
		
		longV=100;
		float floatV=longV;
		System.out.println("floatV : " + floatV);
		
		floatV=100.5f;
		double doubleV=floatV;
		System.out.println("doubleV : " + doubleV);
		
		/* byte byte1=65;
		char char1=byte1; */ //컴파일에러: byte타입은 음수를 포함하지만, char타입의 범위는 음수를 포함하지 않는다.
	}
}
