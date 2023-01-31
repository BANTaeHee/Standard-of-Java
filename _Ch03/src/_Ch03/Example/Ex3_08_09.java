package _Ch03.Example;

public class Ex3_08_09 {

	public static void main(String[] args) {

		byte a = 10;
		byte b = 30;
		byte c = (byte)(a*b);		// int타입보다 피연산자 byte타입이 범위가 작아서 int타입으로 변환.
		System.out.println(c);		// byte타입으로 형변환을 했고, byte타입의 범위보다 300이 더큼. 그래서 값손실 발생
		
		
		System.out.println("==========================");
		
		int A = 1_000_000;		// 1백만 = 10의 6제곱
		int B = 2_000_000;		// 2백만 = 10의 6제곱
		
		// 10의 12제곱. 	int의 범위는 10의 9제곱.
		long C = A * B;				// a * b = 2,000,000,000,000 ?
		// A 혹은 B를 long으로 형변환해주면 2,000,000,000,000이 나온다.
		System.out.println(C);		// 오버플로우 발생
		
	}

}
