public class p075 {
	public static void main(String[] args) {
		// TODO 혼공자 강제 타입 변환

		//큰 범위 → 작은 범위는 강제로 나눠서 저장해야한다. 큰 그릇에 가득 채운 물을 작은 그릇에 채울 수 없듯이.
		int intV = 44032;
		char charV = (char)intV;
		System.out.println(charV);
		
		long longV = 500;
		intV = (int)longV;
		System.out.println(intV);
		
		double doubleV = 3.14;
		intV = (int)doubleV;
		System.out.println(intV); //실수타입은 정수타입으로 자동 변환되지 않기때문에 강제 타입 변환을 사용한다. 소수점은 버려진다.
	}
}
	
